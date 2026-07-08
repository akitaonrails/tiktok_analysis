package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.topic.book.IBookTokService;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0O4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613410O4d implements InterfaceC613500O4m {
    public static boolean LJII;
    public Boolean LIZIZ;
    public int LJ;
    public final IBookTokService<?, ?, ?, ?> LIZ = (IBookTokService) ServiceManager.get().getService(IBookTokService.class);
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJFF = "";
    public String LJI = "";

    @Override // X.InterfaceC21284718Rh
    public final void LIZIZ() {
        LJII = false;
    }

    @Override // X.InterfaceC613500O4m
    public final boolean LIZ(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null && extra.length() != 0) {
            try {
                String extra2 = anchorCommonStruct.getExtra();
                if (extra2 != null) {
                    return new JSONObject(extra2).optBoolean("is_collected", false);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LIZLLL(Aweme aweme) {
        LJII(aweme);
    }

    public final void LJII(Aweme aweme) {
        String strLJJLIIIJ;
        String groupId = aweme.getGroupId();
        String str = "";
        if (groupId == null) {
            groupId = "";
        }
        this.LJFF = groupId;
        this.LJ = 0;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null) {
            return;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE()) {
                try {
                    String extra = anchorCommonStruct.getExtra();
                    if (extra != null) {
                        JSONObject jSONObject = new JSONObject(extra);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append(jSONObject.optString("third_id", ""));
                        sbLIZ.append(',');
                        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZLLL);
                    String keyword = anchorCommonStruct.getKeyword();
                    if (keyword == null) {
                        keyword = "";
                    }
                    sbLIZ2.append(keyword);
                    sbLIZ2.append(',');
                    this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
                    this.LJ++;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(anchors2, null, null, null, 0, null, AFwS240S0000000_9.get$arr$(LSPassThroughRecordSizeConfig.DEFAULT), 31)) != null) {
            str = strLJJLIIIJ;
        }
        this.LJI = str;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIIIZZ(C0O4M c0o4m) {
        if (c0o4m != null) {
            C0O4L.LIZJ(C0O4K.BOOK, c0o4m);
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIILIIL(C0O4M c0o4m) {
        if (c0o4m != null) {
            C0O4L.LIZ(C0O4K.BOOK, c0o4m);
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final String LJIILJJIL(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct != null) {
            String extra = anchorCommonStruct.getExtra();
            if (extra != null && extra.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    String extra2 = anchorCommonStruct.getExtra();
                    if (extra2 != null) {
                        return new JSONObject(extra2).optString("third_id", "");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return "";
    }

    @Override // X.InterfaceC21284718Rh
    public final Boolean LJIILLIIL(String str) {
        if (str != null) {
            return C0O4L.LIZIZ(C0O4K.BOOK, str);
        }
        return null;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJFF(Aweme aweme, boolean z) {
        String str;
        if (aweme != null) {
            LJII(aweme);
        }
        if (!LJII) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (z) {
                str = "books";
            } else {
                str = "links";
            }
            c2344009Gk.LJIIIIZZ("panel_type", str);
            c2344009Gk.LIZJ(this.LJ, "book_num");
            c2344009Gk.LJIIIIZZ("group_id", this.LJFF);
            c2344009Gk.LJIIIIZZ("book_id", this.LIZJ);
            c2344009Gk.LJIIIIZZ("book_title", this.LIZLLL);
            C20684815ws.LJIILLIIL("book_panel_show", c2344009Gk.LIZ);
            LJII = true;
        }
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIL(Boolean bool, String str) {
        if (str != null && bool != null) {
            bool.booleanValue();
            C0O4L.LIZLLL(C0O4K.BOOK, str, bool.booleanValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[PHI: r5
      0x003f: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:7:0x0011, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r16, java.lang.String r17, boolean r18) {
        /*
            X.0O4X r0 = X.C0O4X.BOOK
            int r1 = r0.getType()
            java.lang.String r7 = ""
            if (r16 == 0) goto L10
            java.lang.String r5 = r16.getKeyword()
            if (r5 != 0) goto L3f
        L10:
            r5 = r7
            if (r16 != 0) goto L3f
            r6 = 0
        L14:
            if (r16 == 0) goto L1d
            java.lang.String r0 = r16.getDescription()
            if (r0 == 0) goto L1d
            r7 = r0
        L1d:
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r2 = new com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8 = 0
            r4 = r17
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0O4l r0 = new X.0O4l
            r1 = r18
            r0.<init>(r2, r1)
            X.C1440005kM.LIZ(r0)
            return
        L3f:
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r16.getThumbnail()
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613410O4d.LJIIIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC21284718Rh
    public final C2344009Gk LIZJ(C2344009Gk c2344009Gk, String str, Aweme aweme) {
        String authorUid;
        String aid;
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("anchor_type", this.LJI);
        c2344009Gk.LIZJ(this.LJ, "book_num");
        c2344009Gk.LJIIIIZZ("book_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("book_title", this.LIZLLL);
        return c2344009Gk;
    }

    @Override // X.InterfaceC21284718Rh
    public final C2344009Gk LJ(C2344009Gk c2344009Gk, String str, Aweme aweme) {
        String authorUid;
        String aid;
        if (aweme != null) {
            LJII(aweme);
        }
        if (c2344009Gk == null) {
            c2344009Gk = new C2344009Gk();
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("anchor_type", this.LJI);
        c2344009Gk.LIZJ(this.LJ, "book_num");
        c2344009Gk.LJIIIIZZ("book_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("book_title", this.LIZLLL);
        return c2344009Gk;
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIJ(String str, Aweme aweme, AnchorCommonStruct anchorCommonStruct) {
        String authorUid;
        String aid;
        String keyword;
        if (aweme != null) {
            LJII(aweme);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String logExtra = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("group_id", this.LJFF);
        c2344009Gk.LJIIIIZZ("book_id", LJIILJJIL(anchorCommonStruct));
        if (anchorCommonStruct != null) {
            keyword = anchorCommonStruct.getKeyword();
        } else {
            keyword = null;
        }
        c2344009Gk.LJIIIIZZ("book_title", keyword);
        if (anchorCommonStruct != null) {
            logExtra = anchorCommonStruct.getLogExtra();
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(logExtra);
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
        c2344009Gk.LJIIIIZZ("category", "book");
        C20684815ws.LJIILLIIL("enter_topic_detail", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIILL(AnchorCommonStruct anchorCommonStruct, String str, boolean z) {
        InterfaceC346201Wa interfaceC346201WaLIZLLL;
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        if (this.LIZIZ == null) {
            this.LIZIZ = Boolean.valueOf(z);
        }
        if (!z) {
            interfaceC346201WaLIZLLL = this.LIZ.LJ(str);
        } else {
            interfaceC346201WaLIZLLL = this.LIZ.LIZLLL(str);
        }
        C23250099c.LIZLLL(c054gLIZ, null, null, new C613100O2y(interfaceC346201WaLIZLLL, this, str, !z, anchorCommonStruct, null), 3);
    }

    @Override // X.InterfaceC21284718Rh
    public final void LJIIJJI(Activity activity, AnchorCommonStruct anchorCommonStruct, String str, C2344009Gk c2344009Gk) {
        C327850CtD.LIZIZ("book_detail_page");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//topic/book");
        smartRouteBuildRoute.withParam("book_id", LJIILJJIL(anchorCommonStruct));
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC21284718Rh
    public final C2344009Gk LJI(C2344009Gk c2344009Gk, String str, Aweme aweme, String str2, AnchorCommonStruct anchorCommonStruct) {
        String keyword;
        String authorUid;
        String aid;
        if (c2344009Gk == null) {
            c2344009Gk = new C2344009Gk();
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (anchorCommonStruct != null) {
            keyword = anchorCommonStruct.getKeyword();
        } else {
            keyword = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_entry", keyword);
        String str3 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("click_type", "app_page");
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(aweme));
        c2344009Gk.LJIIIIZZ("anchor_type", "book");
        c2344009Gk.LIZJ(this.LJ, "book_num");
        c2344009Gk.LJIIIIZZ("book_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("book_title", this.LIZLLL);
        C1E95 c1e95 = C1E95.LIZIZ;
        if (c1e95.LJIILL()) {
            c2344009Gk.LIZJ(c1e95.LJJIFFI(C735370Ssx.LIZJ(aweme)), "spammy_tag_cnt");
        }
        return c2344009Gk;
    }
}
