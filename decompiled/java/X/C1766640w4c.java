package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1766640w4c extends C14TU {
    public String LLL;
    public final C1766660w4e LLLF;

    public C1766640w4c(Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
    }

    @Override // X.C14TU, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C14TU
    public void LIZLLL() {
        if (!getEcVideoSingleManager().LIZJ(getScene())) {
            super.LIZLLL();
            return;
        }
        C586940N0i videoControl = getVideoControl();
        if (videoControl != null) {
            videoControl.LIZJ();
        }
    }

    @Override // X.C14TU
    public final C0N0Y LJ() {
        return getEcVideoSingleManager().LJFF(getScene());
    }

    @Override // X.C14TU
    public void LJIIIIZZ() {
        if (getEcVideoSingleManager().LIZJ(getScene())) {
            return;
        }
        super.LJIIIIZZ();
    }

    @Override // X.C14TU
    public void LJIILIIL() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        C0N0Y c0n0y;
        C586940N0i videoControl;
        if (C1832807Fu.LIZ() && (videoControl = getVideoControl()) != null) {
            videoControl.LIZJ();
        }
        if (!getEcVideoSingleManager().LIZJ(getScene()) && getEcVideoSingleManager().LIZ(getScene())) {
            C586940N0i videoControl2 = getVideoControl();
            if (videoControl2 != null && (c0n0y = videoControl2.LIZIZ) != null) {
                c0n0y.seek(0.0f);
            }
            LJFF();
        }
        Context context = getContext();
        Object baseContext = null;
        if ((context instanceof ContextWrapper) && (contextWrapper = (ContextWrapper) context) != null) {
            baseContext = contextWrapper.getBaseContext();
        }
        if (!(baseContext instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) baseContext) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    public final boolean LJIJ() {
        C0N0Y videoPlayer;
        C0N0Y videoPlayer2 = getVideoPlayer();
        return videoPlayer2 != null && videoPlayer2.isPlaying() && (videoPlayer = getVideoPlayer()) != null && videoPlayer.LJLJI(this);
    }

    @Override // X.C14TU
    public C0N0Y getVideoPlayer() {
        String scene = getScene();
        if (scene == null || a0.LJJJIL(scene) || getEcVideoSingleManager().LIZJ(getScene())) {
            return null;
        }
        return super.getVideoPlayer();
    }

    @Override // X.C14TU, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (getEcVideoSingleManager().LIZ(getScene())) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // X.C14TU
    public void pause() {
        if (getEcVideoSingleManager().LIZJ(getScene())) {
            return;
        }
        super.pause();
    }

    public InterfaceC1766650w4d getEcVideoSingleManager() {
        return this.LLLF;
    }

    public String getScene() {
        return this.LLL;
    }

    @Override // X.C14TU, X.InterfaceC20270014Ta
    public void LIZ(Function0<Unit> function0) {
        if (getEcVideoSingleManager().LIZJ(getScene())) {
            return;
        }
        super.LIZ(function0);
    }

    @Override // X.C14TU
    public Aweme LJIIIZ(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = JSONObjectProtectorUtils.getString(jSONObject, "aweme_id");
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "video");
                JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "play_addr");
                String string2 = JSONObjectProtectorUtils.getString(jSONObject3, "uri");
                String string3 = JSONObjectProtectorUtils.getString(jSONObject3, "url_key");
                String string4 = JSONArrayProtectorUtils.getString(JSONObjectProtectorUtils.getJSONArray(jSONObject3, "url_list"), 0);
                int i = JSONObjectProtectorUtils.getInt(jSONObject2, "width");
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject2, "height");
                String string5 = JSONObjectProtectorUtils.getString(jSONObject2, "ratio");
                Aweme aweme = new Aweme();
                aweme.setAid(string);
                Video video = new Video();
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUri(string2);
                videoUrlModel.setUrlKey(string3);
                ArrayList arrayList = new ArrayList();
                arrayList.add(string4);
                videoUrlModel.setUrlList(arrayList);
                video.setPlayAddr(videoUrlModel);
                video.setWidth(i);
                video.setHeight(i2);
                video.setRatio(string5);
                aweme.setVideo(video);
                return aweme;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return super.LJIIIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:5:0x001d, B:7:0x0028, B:9:0x002e, B:10:0x0032, B:16:0x003e, B:18:0x0044, B:24:0x0050, B:25:0x0058, B:27:0x0064), top: B:56:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1766640w4c.LJIJI(java.lang.String):java.lang.Object");
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        if (LJIILL(str)) {
            int completeCount = getCompleteCount();
            setCompleteCount(completeCount + 1);
            LJII("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(completeCount))));
            if (!getEcVideoSingleManager().LIZJ(getScene())) {
                LJFF();
            }
        }
    }

    @Override // X.C14TU, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C1481290oeN c1481290oeN) {
        if (LJIILL(c1481290oeN.LIZ)) {
            LJII("onPlayFailed", C2097608Jq.LJI(new Pair("code", Integer.valueOf(c1481290oeN.LJ))));
        }
    }

    public void setScene(String str) {
        this.LLL = str;
    }

    @Override // X.C14TU
    public void setSinglePlayerScene(String str) {
        setScene(str);
        InterfaceC1766650w4d ecVideoSingleManager = getEcVideoSingleManager();
        String scene = getScene();
        String scene2 = getScene();
        boolean z = false;
        if (scene2 != null && u.LJJIIJZLJL(scene2, "non_single_", false)) {
            z = true;
        }
        ecVideoSingleManager.LIZIZ(scene, !z);
        if (getEcVideoSingleManager().LJI(getScene())) {
            getEcVideoSingleManager().LJ(getScene());
            C0N0Y c0n0yLJII = getEcVideoSingleManager().LJII(getScene());
            if (c0n0yLJII != null) {
                c0n0yLJII.seek(0.0f);
            }
        }
    }

    private final void LJIIZILJ(Integer num, Integer num2, String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("video://commonvideo?play_url=");
            sbLIZ.append(URLEncoder.encode(str, "UTF-8"));
            sbLIZ.append("&width=");
            sbLIZ.append(num);
            sbLIZ.append("&height=");
            sbLIZ.append(num2);
            setSrc(C2188811AlT.LIZIZ(sbLIZ));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public /* synthetic */ C1766640w4c(int i, int i2, Context context, AttributeSet attributeSet) {
        this((i2 & 4) != 0 ? 0 : i, context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 8) != 0);
    }

    public C1766640w4c(int i, Context context, AttributeSet attributeSet, boolean z) {
        super(i, context, attributeSet, z);
        this.LLL = "";
        this.LLLF = C1766660w4e.LIZ;
    }
}
