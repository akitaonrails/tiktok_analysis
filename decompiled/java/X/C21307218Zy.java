package X;

import android.content.Context;
import android.media.MediaPlayer;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21307218Zy extends AbstractC21306018Zm {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Context context;
        final String videoUrl = ((InterfaceC21306118Zn) xBaseParamModel).getVideoUrl();
        if (videoUrl == null) {
            videoUrl = "";
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            context = interfaceC634840OvC2.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        if (videoUrl.length() == 0) {
            InterfaceC21306218Zo interfaceC21306218Zo = (InterfaceC21306218Zo) C1909107dp.LIZJ(InterfaceC21306218Zo.class, containerID);
            interfaceC21306218Zo.setStatus("missing_video_url");
            completionBlock.onSuccess(interfaceC21306218Zo, "");
            return;
        }
        final AwS146S1100000_32 awS146S1100000_32 = new AwS146S1100000_32(completionBlock, containerID, 25);
        MediaPlayer andSet = C21307518a1.LIZIZ.getAndSet(null);
        if (andSet != null) {
            andSet.release();
        }
        C21307518a1.LIZ.set(videoUrl);
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(C786410Ut5.N3(context), UriProtector.parse(videoUrl));
            mediaPlayer.setDisplay(null);
            mediaPlayer.setLooping(true);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.18Zz
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    if (Intrinsics.LJFF(C21307518a1.LIZ.get(), videoUrl)) {
                        AtomicReference<MediaPlayer> atomicReference = C21307518a1.LIZIZ;
                        while (!atomicReference.compareAndSet(null, mediaPlayer2)) {
                            if (atomicReference.get() != null) {
                            }
                        }
                        awS146S1100000_32.invoke("ready");
                        return;
                    }
                    mediaPlayer2.release();
                    awS146S1100000_32.invoke("superseded");
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.18a0
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    mediaPlayer2.release();
                    Function1<String, Unit> function1 = awS146S1100000_32;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error:");
                    sbLIZ.append(i);
                    function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
            });
            mediaPlayer.prepareAsync();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mediaPlayer.release();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error:");
            sbLIZ.append(th.getClass().getSimpleName());
            awS146S1100000_32.invoke(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
