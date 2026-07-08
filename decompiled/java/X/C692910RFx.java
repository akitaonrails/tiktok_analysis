package X;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0RFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692910RFx {
    public static int LJFF;
    public static int LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public final C0RG6 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final C20556415cA LIZLLL;
    public boolean LJ;

    public static int LJ() {
        if (Build.VERSION.SDK_INT >= 28) {
            boolean z = C14LC.LJIIIZ;
            if (C309690CBz.LIZ.LJI) {
                return LJI;
            }
        }
        return LJIIIIZZ;
    }

    public static int LJFF() {
        boolean z = C14LC.LJIIIZ;
        C14LC c14lc = C309690CBz.LIZ;
        int i = c14lc.LIZJ;
        return i == 0 ? LJ() - c14lc.LIZ : i;
    }

    public C692910RFx() {
        this.LIZ = new C0RG6("VideoAdaption");
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LJ = true;
        this.LIZLLL = null;
    }

    public C692910RFx(C20556415cA c20556415cA) {
        this.LIZ = new C0RG6("VideoAdaption");
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LJ = true;
        this.LIZLLL = c20556415cA;
    }

    public static void LIZLLL(Context context) throws Throwable {
        if (context == null) {
            return;
        }
        if (LJI > 0 && LJFF > 0) {
            return;
        }
        if (C656570Pp9.LIZ()) {
            Display displayLLILZIL = C2204961BRm.LLILZIL(C1388190mED.LIZ(context).getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA1Dfezy5+fLgyHIzo77v5mCoD6MV2H7GsasQ=", null));
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayLLILZIL.getRealMetrics(displayMetrics);
            LJIIIIZZ = displayMetrics.heightPixels;
            LJI = C656570Pp9.LIZIZ();
            LJFF = C656570Pp9.LIZJ();
            return;
        }
        Display displayLLILZIL2 = C2204961BRm.LLILZIL(C1388190mED.LIZ(context).getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA1Dfezy5+fLgyHIzo77v5mCoD6MV2H7GsasQ=", null));
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayLLILZIL2.getRealMetrics(displayMetrics2);
        int i = displayMetrics2.heightPixels;
        LJIIIIZZ = i;
        LJI = i + LJII;
        LJFF = displayMetrics2.widthPixels;
    }

    public static void LJI(Context context) {
        try {
            LJII = C497820Jfg.LIZJ(context);
            C14KI.LIZIZ(context);
            LIZLLL(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIL(View view) {
        if (view == null) {
            return;
        }
        if (view.getLayoutParams() == null) {
            C786410Ut5.W5(view, new ViewGroup.LayoutParams(0, 0));
        }
        if (view.getLayoutParams().width != -1 || view.getLayoutParams().height != -1) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    public static void LJII(String str, Video video, ViewGroup viewGroup) {
        if (viewGroup != null && video != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIIJ().LIZJ(str, new C533990Kwv(video.getWidth(), video.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public final C690990R8n LIZIZ(Context context, Aweme aweme, ViewGroup viewGroup) {
        if (aweme != null && aweme.getVideo() != null) {
            Video video = aweme.getVideo();
            C690990R8n c690990R8n = new C690990R8n(video.getWidth(), video.getHeight());
            View view = new View(context);
            C786410Ut5.W5(view, new ViewGroup.MarginLayoutParams(0, 0));
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            LJIIJ(context, aweme, view, video.getWidth(), video.getHeight(), c690990R8n, viewGroup);
            return c690990R8n;
        }
        return new C690990R8n(0, 0);
    }

    public static void LJIILIIL(Aweme aweme, C690890R8d c690890R8d, HashMap map, int i, int i2) {
        if (aweme != null && aweme.getVideo() != null) {
            if (i > 0 && i2 > 0) {
                int width = aweme.getVideo().getWidth();
                int height = aweme.getVideo().getHeight();
                int iLIZ = C745420TLw.LIZ(width, height, i, i2);
                if (iLIZ == 0) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aweme_id", C729980SkG.LIZJ(aweme));
                    jSONObject.put("aweme_position", map.get("aweme_position"));
                    jSONObject.put("video_server_width", width);
                    jSONObject.put("video_server_height", height);
                    jSONObject.put("video_player_width", i);
                    jSONObject.put("video_player_height", i2);
                    jSONObject.put("event_type", map.get("event_type"));
                    jSONObject.put("request_id", map.get("request_id"));
                    C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("video_view_size_mismatch ");
                    sbLIZ.append(jSONObject);
                    c2276411E8h.LIZJ("common_feed", 4, "FeedAllScreenHelper", C2188811AlT.LIZIZ(sbLIZ));
                    C793770VBv.LJIIJJI("video_view_size_mismatch", iLIZ, jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2276411E8h.LIZIZ.LIZIZ("common_feed", e);
                }
                if (iLIZ > 1) {
                    C2276411E8h.LIZIZ.LIZJ("common_feed", 5, "FeedAllScreenHelper", "video_view_size_mismatch, but current strategy does not handle it");
                    return;
                }
                if (aweme.getVideo() != null) {
                    aweme.getVideo().setWidth(i);
                    aweme.getVideo().setHeight(i2);
                    UrlModel originCover = aweme.getVideo().getOriginCover();
                    if (originCover != null) {
                        originCover.setWidth(i);
                        originCover.setHeight(i2);
                    }
                    try {
                        Context context = c690890R8d.LIZ;
                        if (context != null) {
                            c690890R8d.LIZIZ.CX1(context, aweme, c690890R8d.LIZJ, c690890R8d.LIZLLL, AwemeExtKt.getOcrLocation(aweme), c690890R8d.LJ);
                            LJII(aweme.getAid(), aweme.getVideo(), c690890R8d.LJ);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2276411E8h.LIZIZ.LIZIZ("common_feed", e2);
                        return;
                    }
                }
                return;
            }
            C2276411E8h c2276411E8h2 = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("video Player size is wrong, aid is ");
            sbLIZ2.append(C729980SkG.LIZJ(aweme));
            c2276411E8h2.LIZJ("common_feed", 5, "FeedAllScreenHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LIZ(Context context, Aweme aweme, View view, View view2, ViewGroup viewGroup) {
        if (aweme == null) {
            C2276411E8h.LIZIZ.LIZIZ("common_feed", new NullPointerException("aweme is null"));
            return;
        }
        if (aweme.isVr()) {
            LJIIL(view);
            LJIIL(view2);
            return;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return;
        }
        boolean z = C14LC.LJIIIZ;
        C14LC c14lc = C309690CBz.LIZ;
        c14lc.getClass();
        if (view != null) {
            LJIIJ(context, aweme, view, video.getWidth(), video.getHeight(), null, viewGroup);
        }
        LJIIJ(context, aweme, view2, video.getWidth(), video.getHeight(), null, viewGroup);
        C0RG6 c0rg6 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sw:");
        sbLIZ.append(LJFF);
        sbLIZ.append("sh:");
        sbLIZ.append(LJI);
        sbLIZ.append("vph:");
        sbLIZ.append(c14lc.LIZJ);
        sbLIZ.append("vdw:");
        sbLIZ.append(video.getWidth());
        sbLIZ.append("vdh:");
        sbLIZ.append(video.getHeight());
        sbLIZ.append("rw:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("rh:");
        sbLIZ.append(this.LIZIZ);
        c0rg6.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(View view, int i, int i2, int i3, int i4, C690990R8n c690990R8n, Aweme aweme) {
        Context context;
        int i5;
        int i6;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        C1521805xY.LIZ(context);
        double d = ((double) i) / ((double) i2);
        double d2 = ((double) i4) / ((double) i3);
        if ((!C259720AFu.LIZIZ || d >= d2) && d <= 0.625d && d2 <= 0.625d && d >= 0.4699999988079071d) {
            if (i > 0 && i2 > 0) {
                i5 = (i3 * i) / i2;
            } else {
                i5 = i3;
            }
            i6 = i3;
        } else {
            if (i > 0 && i2 > 0) {
                i6 = (i4 * i2) / i;
            } else {
                i6 = i4;
            }
            i5 = i4;
        }
        LJIIJJI(view, i6, i5, c690990R8n, i4, i3, i, i2, aweme);
    }

    public final void LJIIIIZZ(View view, int i, int i2, int i3, int i4, C690990R8n c690990R8n, Aweme aweme) {
        int i5;
        int i6;
        double d = ((double) i) / ((double) i2);
        double d2 = ((double) i4) / ((double) i3);
        if ((!C259720AFu.LIZIZ || d >= d2) && d <= 0.5625d && d2 <= 0.5625d && d >= 0.4699999988079071d) {
            if (i > 0 && i2 > 0) {
                i5 = (i3 * i) / i2;
            } else {
                i5 = i3;
            }
            i6 = i3;
        } else {
            if (i > 0 && i2 > 0) {
                i6 = (i4 * i2) / i;
            } else {
                i6 = i4;
            }
            i5 = i4;
        }
        LJIIJJI(view, i6, i5, c690990R8n, i4, i3, i, i2, aweme);
    }

    public final void LJIIIZ(int i, int i2, int i3, int i4, View view, Aweme aweme, C690990R8n c690990R8n) {
        int i5;
        int i6 = i4;
        if (((double) i) / ((double) i2) > 1.0d) {
            if (i > 0 && i2 > 0) {
                i6 = (i3 * i2) / i;
            } else {
                i6 = i3;
            }
            i5 = i3;
        } else if (i > 0 && i2 > 0) {
            i5 = (i6 * i) / i2;
        } else {
            i5 = i6;
        }
        LJIIJJI(view, i6, i5, c690990R8n, i3, -1, i, i2, aweme);
    }

    public final void LJIIJ(Context context, Aweme aweme, View view, int i, int i2, C690990R8n c690990R8n, ViewGroup viewGroup) {
        LIZLLL(context);
        int iLJFF = LJFF();
        C0RG7 c0rg7LJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIIJ();
        LIZLLL(context);
        int width = LJFF;
        if (viewGroup != null && viewGroup.getWidth() > 0) {
            width = viewGroup.getWidth();
        }
        LIZLLL(context);
        int iLJFF2 = LJFF();
        boolean z = false;
        if (viewGroup != null && viewGroup.getHeight() > 0 && (!((Boolean) C293850BfT.LIZ.getValue()).booleanValue() || viewGroup.getHeight() <= iLJFF2)) {
            iLJFF2 = viewGroup.getHeight();
        }
        if (((Boolean) C293850BfT.LIZ.getValue()).booleanValue()) {
            z = true;
        }
        C533990Kwv c533990Kwv = new C533990Kwv(i, i2, width, iLJFF2);
        if (c0rg7LJIIJ != null && c0rg7LJIIJ.LIZLLL()) {
            C533990Kwv c533990KwvLIZIZ = c0rg7LJIIJ.LIZIZ(c533990Kwv);
            LJIIJJI(view, c533990KwvLIZIZ.LIZLLL, c533990KwvLIZIZ.LIZJ, c690990R8n, -1, -1, i, i2, aweme);
            return;
        }
        int i3 = LJFF;
        int i4 = LJI;
        double d = ((double) i3) / ((double) i4);
        if (d <= 0.5d) {
            if (!z) {
                iLJFF2 = iLJFF;
                width = i3;
            }
            LIZJ(view, i, i2, iLJFF2, width, c690990R8n, aweme);
            return;
        }
        if (d >= 0.6666666666666666d) {
            if (!z) {
                iLJFF2 = i4;
                width = i3;
            }
            LJIIIZ(i, i2, width, iLJFF2, view, aweme, c690990R8n);
            return;
        }
        if (!z) {
            iLJFF2 = iLJFF;
            width = i3;
        }
        LJIIIIZZ(view, i, i2, iLJFF2, width, c690990R8n, aweme);
    }

    public final void LJIIJJI(View view, int i, int i2, C690990R8n c690990R8n, int i3, int i4, int i5, int i6, Aweme aweme) {
        boolean zLIZ;
        C20556415cA c20556415cA;
        Integer num;
        C20556415cA c20556415cA2;
        if (view == null) {
            return;
        }
        if (this.LJ && (c20556415cA2 = this.LIZLLL) != null) {
            zLIZ = c20556415cA2.LIZ(Integer.valueOf(i2), Integer.valueOf(i), i5, i6, i3, i4, aweme);
            if (zLIZ) {
                Integer num2 = this.LIZLLL.LIZ;
                if (num2 != null) {
                    i = num2.intValue();
                }
                Integer num3 = this.LIZLLL.LIZIZ;
                if (num3 != null) {
                    i2 = num3.intValue();
                }
            }
        } else {
            zLIZ = false;
        }
        if (c690990R8n != null) {
            c690990R8n.LIZ = i2;
            c690990R8n.LIZIZ = i;
        }
        this.LIZJ = i2;
        this.LIZIZ = i;
        if (this.LJ && (c20556415cA = this.LIZLLL) != null && zLIZ && (num = c20556415cA.LIZLLL) != null) {
            C786410Ut5.ed(view, num.intValue());
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.width == i2 && marginLayoutParams.height == i) {
            return;
        }
        marginLayoutParams.width = i2;
        marginLayoutParams.height = i;
        C786410Ut5.W5(view, marginLayoutParams);
        C786410Ut5.Ab(view, 0.0f);
    }
}
