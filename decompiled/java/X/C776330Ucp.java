package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ucp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C776330Ucp extends C2217421BqW implements Function1<Boolean, Unit> {
    public C776330Ucp(Object obj) {
        super(1, obj, C776300Ucm.class, "onPauseLive", "onPauseLive(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Room room;
        User owner;
        ImageModel avatarThumb;
        boolean zBooleanValue = bool.booleanValue();
        final C776300Ucm c776300Ucm = (C776300Ucm) this.receiver;
        c776300Ucm.LLJI = zBooleanValue;
        if (zBooleanValue) {
            final Cert certFindCert = CertProviderManagerKt.findCert("bpea-782", 1476788483);
            float fLJIIZILJ = C497740JfY.LJIIZILJ() / C497740JfY.LJIILLIIL();
            DataChannel dataChannel = c776300Ucm.LLILLJJLI;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
                C1324570kZb.LJII(avatarThumb, C497740JfY.LJIIZILJ(), C497740JfY.LJIILLIIL(), new C1291830jin(fLJIIZILJ), new InterfaceC1324590kZd() { // from class: X.0UdC
                    public final /* synthetic */ boolean LIZ = true;
                    public final /* synthetic */ Function0<Boolean> LIZIZ = null;

                    @Override // X.InterfaceC1324590kZd
                    public final void onFailed() {
                        c776300Ucm.LIZIZ(null, certFindCert);
                    }

                    @Override // X.InterfaceC1324590kZd
                    public final void LIZ(Bitmap bitmap) {
                        if (!this.LIZ) {
                            Function0<Boolean> function0 = this.LIZIZ;
                            if (function0 != null && function0.invoke().booleanValue()) {
                                C776300Ucm c776300Ucm2 = c776300Ucm;
                                c776300Ucm2.getClass();
                                c776300Ucm2.LIZIZ(C776300Ucm.LIZ(bitmap), certFindCert);
                                return;
                            }
                            return;
                        }
                        C776300Ucm c776300Ucm3 = c776300Ucm;
                        c776300Ucm3.getClass();
                        c776300Ucm3.LIZIZ(C776300Ucm.LIZ(bitmap), certFindCert);
                    }
                });
            }
            C0UZ9 c0uz9 = c776300Ucm.LLILZ;
            if (c0uz9 != null) {
                c0uz9.LIZLLL(1);
            }
        } else {
            c776300Ucm.LIZLLL(2001, c776300Ucm.LLILZLL);
        }
        return Unit.LIZ;
    }
}
