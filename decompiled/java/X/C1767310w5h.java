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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1767310w5h extends C20299114bl {
    public String LLLF;

    @Override // X.C20299114bl, X.C14TT, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public void LIZIZ() {
        C1766660w4e.LIZ.getClass();
        if (C1766660w4e.LIZLLL) {
            return;
        }
        super.LIZIZ();
    }

    @Override // X.C14TT
    public void LJIIIIZZ() {
        C1766660w4e.LIZ.getClass();
        if (!C1766660w4e.LIZLLL) {
            super.LJIIIIZZ();
            return;
        }
        C586940N0i mVideoControl = getMVideoControl();
        if (mVideoControl != null) {
            mVideoControl.LIZJ();
        }
    }

    @Override // X.C14TT
    public final C0N0Y LJIIIZ() {
        return C1766660w4e.LIZ.LJFF(getScene());
    }

    @Override // X.C14TT
    public void LJIILL() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ContextWrapper contextWrapper;
        C0N0Y c0n0y;
        C1766660w4e.LIZ.getClass();
        if (!C1766660w4e.LIZLLL && C1766660w4e.LIZIZ) {
            C586940N0i mVideoControl = getMVideoControl();
            if (mVideoControl != null && (c0n0y = mVideoControl.LIZIZ) != null) {
                c0n0y.seek(0.0f);
            }
            LJIIJ();
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

    @Override // X.C14TT, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C1766660w4e.LIZ.getClass();
        if (C1766660w4e.LIZIZ) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public void pause() {
        C1766660w4e.LIZ.getClass();
        if (C1766660w4e.LIZLLL) {
            return;
        }
        super.pause();
    }

    public final boolean LJIJJLI() {
        C0N0Y player;
        C0N0Y player2 = getPlayer();
        return player2 != null && player2.isPlaying() && (player = getPlayer()) != null && player.LJLJI(this);
    }

    @Override // X.C14TT
    public C0N0Y getPlayer() {
        String scene = getScene();
        if (scene == null || a0.LJJJIL(scene)) {
            return null;
        }
        C1766660w4e.LIZ.getClass();
        if (C1766660w4e.LIZLLL) {
            return null;
        }
        return super.getPlayer();
    }

    public String getScene() {
        return this.LLLF;
    }

    @Override // X.C14TT, X.AbstractC21340218fI
    public void LJ(Function0<Unit> function0) {
        C1766660w4e.LIZ.getClass();
        if (C1766660w4e.LIZLLL) {
            return;
        }
        super.LJ(function0);
    }

    @Override // X.C14TT
    public Aweme LJIILIIL(String str) {
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
        return super.LJIILIIL(str);
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        if (LJIIZILJ(str)) {
            int completeCount = getCompleteCount();
            setCompleteCount(completeCount + 1);
            LJIIL("onCompleted", C2097608Jq.LJI(new Pair("times", Integer.valueOf(completeCount))));
            C1766660w4e.LIZ.getClass();
            if (!C1766660w4e.LIZLLL) {
                LJIIJ();
            }
        }
    }

    @Override // X.C14TT, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(C1481290oeN c1481290oeN) {
        if (LJIIZILJ(c1481290oeN.LIZ)) {
            LJIIL("onPlayFailed", C2097608Jq.LJI(new Pair("code", Integer.valueOf(c1481290oeN.LJ))));
        }
    }

    public void setScene(String str) {
        this.LLLF = str;
    }

    @Override // X.AbstractC21340218fI
    public void setSinglePlayerScene(String str) {
        boolean z;
        setScene(str);
        C1766660w4e c1766660w4e = C1766660w4e.LIZ;
        String scene = getScene();
        if (scene != null && u.LJJIIJZLJL(scene, "non_single_", false)) {
            z = true;
        } else {
            z = false;
        }
        c1766660w4e.getClass();
        C1766660w4e.LIZIZ = !z;
        if (C1766660w4e.LJ) {
            C1766660w4e.LJ = false;
            C0N0Y c0n0yLJII = c1766660w4e.LJII(getScene());
            if (c0n0yLJII != null) {
                c0n0yLJII.seek(0.0f);
            }
        }
    }

    public C1767310w5h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLLF = "";
    }

    public final void LJIJI(Integer num, Integer num2, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("video://commonvideo?play_url=");
        sbLIZ.append(URLEncoder.encode(str, "UTF-8"));
        sbLIZ.append("&width=");
        sbLIZ.append(num);
        sbLIZ.append("&height=");
        sbLIZ.append(num2);
        setSrc(C2188811AlT.LIZIZ(sbLIZ));
    }
}
