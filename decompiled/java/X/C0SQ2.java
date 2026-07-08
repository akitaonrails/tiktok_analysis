package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.AnchorConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SQ2 extends FrameLayout {
    public final C705500Rls LL;
    public String LLILLJJLI;

    public final String getMEventType() {
        return this.LLILLJJLI;
    }

    public final void setMEventType(String str) {
        this.LLILLJJLI = str;
    }

    public C0SQ2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.a1j, this);
        this.LL = (C705500Rls) findViewById(R.id.e_y);
    }

    public static UrlModel LIZIZ(UrlModel urlModel, AnchorCommonStruct anchorCommonStruct) {
        UrlModel urlModel2;
        Object c098200Yq;
        if (anchorCommonStruct.getType() == EnumC1430380nKG.POI.getTYPE()) {
            C0SQ3.LIZ.getClass();
            boolean z = false;
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_location_icon_ab_group", true);
            if (iLJIJ != 1) {
                if (iLJIJ != 2) {
                    if (iLJIJ == 3) {
                        String extra = anchorCommonStruct.getExtra();
                        if (extra != null && extra.length() > 0) {
                            try {
                                if (JSONObjectProtectorUtils.getInt(new JSONObject(extra), "is_ls_key_category") == 1) {
                                    z = true;
                                }
                                c098200Yq = Boolean.valueOf(z);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                        } else {
                            c098200Yq = null;
                        }
                        if (Intrinsics.LJFF(c098200Yq, Boolean.TRUE)) {
                            urlModel2 = (UrlModel) ((HashMap) C0SQ3.LIZ()).get(3);
                        }
                    }
                } else {
                    urlModel2 = (UrlModel) ((HashMap) C0SQ3.LIZ()).get(2);
                }
            } else {
                urlModel2 = (UrlModel) ((HashMap) C0SQ3.LIZ()).get(1);
            }
            if (urlModel2 != null) {
                return urlModel2;
            }
        }
        return urlModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Aweme aweme, C0SQ1 c0sq1) {
        String str;
        UrlModel urlModel;
        this.LL.setRootBackgroundDrawable(null);
        if (c0sq1 == null || (str = c0sq1.LIZIZ) == null) {
            str = "";
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                int type = anchorCommonStruct.getType();
                if (type == EnumC1430380nKG.GREEN_SCREEN_ANCHOR_TYPE.getTYPE()) {
                    UrlModel urlModel2 = new UrlModel();
                    urlModel2.setUri("https://sf16-ies-music-sg.tiktokcdn.com/obj/tiktok-obj/green_screen_anchor.png");
                    urlModel2.setUrlList(C1697810uHb.LJ("https://sf16-ies-music-sg.tiktokcdn.com/obj/tiktok-obj/green_screen_anchor.png"));
                    anchorCommonStruct.setNewStyleBubbleIcon(LIZIZ(urlModel2, anchorCommonStruct));
                } else if (type == EnumC1430380nKG.CAMERA_LAYOUT_ANCHOR_TYPE.getTYPE()) {
                    UrlModel urlModel3 = new UrlModel();
                    C01GW c01gw = C310650CFr.LIZIZ;
                    urlModel3.setUri(((AnchorConfig) c01gw.getValue()).icons.anchor);
                    urlModel3.setUrlList(C1697810uHb.LJ(((AnchorConfig) c01gw.getValue()).icons.anchor));
                    anchorCommonStruct.setNewStyleBubbleIcon(LIZIZ(urlModel3, anchorCommonStruct));
                } else {
                    Map<Integer, String> map = C0BZ7.LIZ;
                    int type2 = anchorCommonStruct.getType();
                    C01GW c01gw2 = C0BZ7.LIZIZ;
                    if (((Map) c01gw2.getValue()).containsKey(Integer.valueOf(type2))) {
                        UrlModel urlModel4 = new UrlModel();
                        urlModel4.setUri((String) ((Map) c01gw2.getValue()).get(Integer.valueOf(anchorCommonStruct.getType())));
                        urlModel4.setUrlList(C1697810uHb.LJ(((Map) c01gw2.getValue()).get(Integer.valueOf(anchorCommonStruct.getType()))));
                        anchorCommonStruct.setNewStyleBubbleIcon(LIZIZ(urlModel4, anchorCommonStruct));
                    } else {
                        C0SQI c0sqi = C0SQI.LIZ;
                        int type3 = anchorCommonStruct.getType();
                        c0sqi.getClass();
                        Map map2 = (Map) C0SQI.LIZIZ.getValue();
                        if (map2 != null) {
                            urlModel = (UrlModel) map2.get(Integer.valueOf(type3));
                        } else {
                            urlModel = null;
                        }
                        anchorCommonStruct.setNewStyleBubbleIcon(LIZIZ(urlModel, anchorCommonStruct));
                    }
                }
            }
        }
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ == null) {
            return;
        }
        if (this.LL.LL.LJJLIIIJ(new C712510RxB(aweme, activityLIZ, str, new JSONObject(), true, null, null, null), null) == 0) {
            C1351950lHl.LJIJJ(this);
            this.LL.LJJIFFI();
            return;
        }
        C1351950lHl.LJIJJLI(this);
        C705500Rls c705500Rls = this.LL;
        if (!c705500Rls.LLILLJJLI) {
            C20673215v0.LIZLLL(R.layout.a1g, C1388190mED.LIZ(c705500Rls.getContext()), c705500Rls, true);
            c705500Rls.LLILLJJLI = true;
        }
        c705500Rls.LJJIFFI();
        if (c705500Rls.LL.LJJJZ()) {
            int visibility = c705500Rls.getVisibility();
            c705500Rls.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c705500Rls);
            c705500Rls.LL.LJJLIIIIJ(c705500Rls);
        }
    }
}
