package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349730lEB {
    public InterfaceC665370Q7z LIZ;
    public Aweme LIZIZ;
    public CommentContextSource LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public final C1349590lDx LJFF = new C1349590lDx("DefaultCommentPageVM");
    public int LJI = -3;

    public final void LIZ() {
        C1344030l4z.LIZJ("DefaultCommentPageVM", "markHasLanding  true");
        this.LIZLLL = true;
    }

    public final void LIZJ() {
        List listLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ;
        if (interfaceC665370Q7z != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, ICommentPageVisibilityProtocol.class, false)) != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((ICommentPageVisibilityProtocol) it2.next()).P61();
            }
        }
        if (((Boolean) C0AE2.LIZLLL.getValue()).booleanValue()) {
            C20737016Cq.LIZ(new String[]{"stop_do_frame"}, 0L, 6);
        }
        if (((Boolean) C0AE2.LIZJ.getValue()).booleanValue()) {
            C20737016Cq.LIZ(new String[]{"reset_main_thread_priority"}, 0L, 6);
        }
    }

    public final void LIZLLL(boolean z) {
        List<ICommentPageVisibilityProtocol> listLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ;
        if (interfaceC665370Q7z != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, ICommentPageVisibilityProtocol.class, false)) != null) {
            for (ICommentPageVisibilityProtocol iCommentPageVisibilityProtocol : listLIZIZ) {
                if (z) {
                    iCommentPageVisibilityProtocol.LLFF();
                } else {
                    iCommentPageVisibilityProtocol.onPagePause();
                }
            }
        }
    }

    public final void LIZIZ(long j, long j2, String str, String str2) {
        String strEventType;
        String aid;
        String authorUid;
        User author;
        String strEnterMethod;
        C1350920lG6.LIZ.getClass();
        if (!C1350920lG6.LJJIJIL(2, "close_comment_2tab") && !C1350920lG6.LJJIJIL(1, "close_comment_2tab")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            CommentContextSource commentContextSource = this.LIZJ;
            String str3 = "";
            if (commentContextSource == null || (strEventType = CommentContextSourceKt.eventType(commentContextSource)) == null) {
                strEventType = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", strEventType);
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("tab_name", str);
            Aweme aweme = this.LIZIZ;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            Aweme aweme2 = this.LIZIZ;
            if (aweme2 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
                authorUid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            Aweme aweme3 = this.LIZIZ;
            if (aweme3 != null) {
                author = aweme3.getAuthor();
            } else {
                author = null;
            }
            c735840Sti.getClass();
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
            c2344009Gk.LIZLLL(j, "duration");
            c2344009Gk.LIZLLL(j2, "valid_duration");
            c2344009Gk.LJIIIIZZ("action_type", C1350920lG6.LJIILJJIL(str2));
            if (C123100dR.LIZ(this.LJ)) {
                str3 = this.LJ;
            } else {
                CommentContextSource commentContextSource2 = this.LIZJ;
                if (commentContextSource2 != null && (strEnterMethod = CommentContextSourceKt.enterMethod(commentContextSource2)) != null) {
                    str3 = strEnterMethod;
                }
            }
            c2344009Gk.LJIIIIZZ("enter_method", str3);
            C20684815ws.LJIILLIIL("close_comment_2tab", c2344009Gk.LIZ);
        }
    }

    public final void LJ(boolean z, CommentContextSource commentContextSource, List<InterfaceC1349750lED> list, Fragment fragment) {
        Long lValueOf;
        int iHashCode;
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ;
        Aweme aweme;
        Aweme aweme2;
        AwemeStatistics statistics;
        int iHashCode2;
        IRefactorKeyboardFragment iRefactorKeyboardFragmentLJIIJ2;
        List listLIZIZ;
        ICommerceCommentService iCommerceCommentServiceLIZJ;
        Aweme aweme3;
        List listLLIIII;
        boolean zLJI = MethodIDManager.LJI(71943);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageVisibleChange showPage:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iCommerceCommentServiceLIZJ = iCommerceService.LIZJ()) != null) {
            if (commentContextSource != null) {
                aweme3 = CommentContextSourceKt.aweme(commentContextSource);
            } else {
                aweme3 = null;
            }
            if (list == null) {
                listLLIIII = null;
            } else {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InterfaceC1349750lED> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(it2.next().Rc()));
                }
                listLLIIII = C13LP.LLIIII(arrayList);
            }
            iCommerceCommentServiceLIZJ.LJFF(aweme3, listLLIIII, z);
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZ;
        if (interfaceC665370Q7z != null && (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, ICommentPageVisibilityProtocol.class, false)) != null) {
            for (ICommentPageVisibilityProtocol iCommentPageVisibilityProtocol : (ArrayList) listLIZIZ) {
                if (z) {
                    iCommentPageVisibilityProtocol.LJJJJZI();
                } else {
                    iCommentPageVisibilityProtocol.LJLLLLLL();
                }
            }
        }
        if (list != null) {
            Iterator<InterfaceC1349750lED> it3 = list.iterator();
            while (it3.hasNext()) {
                it3.next().BC(z);
            }
        }
        if (z) {
            Activity activityLJFF = C2214201BlK.LJFF();
            C0SYH c0syh = new C0SYH(1);
            if (activityLJFF != null) {
                iHashCode2 = activityLJFF.hashCode();
            } else {
                iHashCode2 = 0;
            }
            c0syh.LIZIZ = iHashCode2;
            C1440005kM.LIZ(c0syh);
            InterfaceC665370Q7z interfaceC665370Q7z2 = this.LIZ;
            if (interfaceC665370Q7z2 != null && (iRefactorKeyboardFragmentLJIIJ2 = C1345760l7m.LJIIJ(fragment, interfaceC665370Q7z2)) != null) {
                iRefactorKeyboardFragmentLJIIJ2.hn();
            }
        } else {
            Activity activityLJFF2 = C2214201BlK.LJFF();
            C0SYH c0syh2 = new C0SYH(0);
            if (commentContextSource != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSource)) != null && (statistics = aweme2.getStatistics()) != null) {
                lValueOf = Long.valueOf(statistics.getCommentCount());
            } else {
                lValueOf = null;
            }
            C1346420l8q.LJFF(lValueOf);
            if (activityLJFF2 != null) {
                iHashCode = activityLJFF2.hashCode();
            } else {
                iHashCode = 0;
            }
            c0syh2.LIZIZ = iHashCode;
            if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
                aweme.getAid();
            }
            C1440005kM.LIZ(c0syh2);
            InterfaceC665370Q7z interfaceC665370Q7z3 = this.LIZ;
            if (interfaceC665370Q7z3 != null && (iRefactorKeyboardFragmentLJIIJ = C1345760l7m.LJIIJ(fragment, interfaceC665370Q7z3)) != null) {
                iRefactorKeyboardFragmentLJIIJ.E7();
            }
        }
        this.LJFF.LIZLLL(z, this.LIZ, fragment, false);
        if (z) {
            if (((Boolean) C305060BxY.LIZLLL.getValue()).booleanValue()) {
                C20737016Cq.LIZ(new String[]{"start_jit_block"}, 500L, 4);
            }
            C20737016Cq.LIZ(new String[]{"start_jit_compile_opt"}, 500L, 4);
            if (C305060BxY.LIZ()) {
                C20737016Cq.LIZ(new String[]{"start_boot_finish"}, 500L, 4);
            }
            if (((Boolean) C0AE2.LIZIZ.getValue()).booleanValue()) {
                C20737016Cq.LIZ(new String[]{"start_log_block"}, 500L, 4);
            }
            if (((Boolean) C0AE2.LIZLLL.getValue()).booleanValue()) {
                C20737016Cq.LIZ(new String[]{"start_do_frame"}, 0L, 6);
            }
            if (((Boolean) C0AE2.LIZJ.getValue()).booleanValue()) {
                C20737016Cq.LIZ(new String[]{"main_thread_priority"}, 0L, 6);
            }
            C1344030l4z.LIZJ("DefaultCommentPageVM", "markHasLanding  false");
            this.LIZLLL = false;
            this.LJ = null;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJFF(List<InterfaceC1349750lED> list, int i, int i2, String str, String str2, boolean z, boolean z2) {
        Integer numValueOf;
        String tabName;
        String tabName2;
        long j;
        String str3;
        String strEventType;
        String str4;
        String aid;
        String authorUid;
        int i3;
        String str5;
        AwemeStatistics statistics;
        InterfaceC1349750lED interfaceC1349750lED;
        InterfaceC1349750lED interfaceC1349750lED2;
        InterfaceC1349750lED interfaceC1349750lED3;
        InterfaceC1349750lED interfaceC1349750lED4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tabVisibleChange  ");
        sbLIZ.append(i);
        sbLIZ.append("  ");
        sbLIZ.append(i2);
        sbLIZ.append("  innerLast");
        C1349730lEB c1349730lEB = this;
        sbLIZ.append(c1349730lEB.LJI);
        sbLIZ.append(" isTabSelectedChanged=");
        sbLIZ.append(z);
        sbLIZ.append(" isLandingFinish = ");
        sbLIZ.append(c1349730lEB.LIZLLL);
        sbLIZ.append(" pagePanelList.size = ");
        User author = null;
        String tabName3 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1344030l4z.LIZJ("DefaultCommentPageVM", C2188811AlT.LIZIZ(sbLIZ));
        if (i == i2) {
            C1349760lEE.LIZ("DefaultCommentPageVM", "tabVisibleChange  same position");
            return;
        }
        c1349730lEB.LJI = i2;
        if (c1349730lEB.LIZLLL && list != null && (!list.isEmpty())) {
            if (i == -1) {
                if (i2 >= 0 && i2 < list.size()) {
                    interfaceC1349750lED4 = (InterfaceC1349750lED) ListProtector.get(list, i2);
                } else {
                    interfaceC1349750lED4 = null;
                }
                if (z) {
                    if (interfaceC1349750lED4 != null) {
                        interfaceC1349750lED4.u5("", null, true);
                    }
                } else if (interfaceC1349750lED4 != null) {
                    interfaceC1349750lED4.Pz(str2);
                }
                c1349730lEB.LJFF.LJI(0L);
                return;
            }
            if (i2 == -1) {
                if (i >= 0 && i < list.size()) {
                    interfaceC1349750lED3 = (InterfaceC1349750lED) ListProtector.get(list, i);
                } else {
                    interfaceC1349750lED3 = null;
                }
                if (z) {
                    if (interfaceC1349750lED3 != null) {
                        interfaceC1349750lED3.u5(str, null, false);
                    }
                } else if (C294820Bh2.LIZ()) {
                    Iterator<InterfaceC1349750lED> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().Fv(str);
                    }
                } else if (interfaceC1349750lED3 != null) {
                    interfaceC1349750lED3.Fv(str);
                }
                C1349590lDx c1349590lDx = c1349730lEB.LJFF;
                if (c1349590lDx.LIZ > 0) {
                    long jLIZ = c1349590lDx.LIZ();
                    if (interfaceC1349750lED3 != null) {
                        tabName3 = interfaceC1349750lED3.getTabName();
                    }
                    c1349730lEB.LIZIZ(jLIZ, c1349730lEB.LJFF.LIZIZ(jLIZ), tabName3, str);
                }
                c1349730lEB.LJFF.LJFF();
                return;
            }
            if (i >= 0 && i < list.size() && (interfaceC1349750lED2 = (InterfaceC1349750lED) ListProtector.get(list, i)) != null) {
                tabName = interfaceC1349750lED2.getTabName();
            } else {
                tabName = null;
            }
            if (i2 >= 0 && i2 < list.size() && (interfaceC1349750lED = (InterfaceC1349750lED) ListProtector.get(list, i2)) != null) {
                tabName2 = interfaceC1349750lED.getTabName();
            } else {
                tabName2 = null;
            }
            if (!z2) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                CommentContextSource commentContextSource = c1349730lEB.LIZJ;
                if (commentContextSource == null || (strEventType = CommentContextSourceKt.eventType(commentContextSource)) == null) {
                    strEventType = "";
                }
                c2344009Gk.LJIIIIZZ("enter_from", strEventType);
                if (tabName == null) {
                    str4 = "";
                } else {
                    str4 = tabName;
                }
                c2344009Gk.LJIIIIZZ("from_tab_name", str4);
                if (tabName2 == null) {
                    tabName2 = "";
                }
                c2344009Gk.LJIIIIZZ("to_tab_name", tabName2);
                Aweme aweme = c1349730lEB.LIZIZ;
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                Aweme aweme2 = c1349730lEB.LIZIZ;
                if (aweme2 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme2)) == null) {
                    authorUid = "";
                }
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                C735840Sti c735840Sti = C735840Sti.LIZ;
                Aweme aweme3 = c1349730lEB.LIZIZ;
                if (aweme3 != null) {
                    author = aweme3.getAuthor();
                }
                c735840Sti.getClass();
                c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
                String str6 = c1349730lEB.LJ;
                if (str6 == null) {
                    str6 = "";
                }
                c2344009Gk.LJIIIIZZ("enter_method", str6);
                c2344009Gk.LJIIIIZZ("action_type", C1350920lG6.LJIILJJIL(str));
                Aweme aweme4 = c1349730lEB.LIZIZ;
                if (aweme4 != null && (statistics = aweme4.getStatistics()) != null && statistics.getCommentCount() > 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                c2344009Gk.LIZJ(i3, "is_zero_comment");
                if (C729510SjV.LJJIJIL(c1349730lEB.LIZIZ)) {
                    str5 = "story";
                } else {
                    str5 = "post";
                }
                c2344009Gk.LJIIIIZZ("story_type", str5);
                C20684815ws.LJIILLIIL("change_comment_tab", c2344009Gk.LIZ);
                C1349590lDx c1349590lDx2 = c1349730lEB.LJFF;
                if (c1349590lDx2.LIZ > 0) {
                    long jLIZ2 = c1349590lDx2.LIZ();
                    long jLIZIZ = c1349730lEB.LJFF.LIZIZ(jLIZ2);
                    j = 0;
                    c1349730lEB = c1349730lEB;
                    c1349730lEB.LIZIZ(jLIZ2, jLIZIZ, tabName, str);
                } else {
                    j = 0;
                }
                c1349730lEB.LJ = tabName;
            } else {
                j = 0;
            }
            c1349730lEB.LJFF.LJFF();
            c1349730lEB.LJFF.LJI(j);
            int i4 = 0;
            for (InterfaceC1349750lED interfaceC1349750lED5 : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    InterfaceC1349750lED interfaceC1349750lED6 = interfaceC1349750lED5;
                    if (i4 == i) {
                        if (z) {
                            interfaceC1349750lED6.u5(str, null, false);
                        } else {
                            interfaceC1349750lED6.Fv(str);
                        }
                    } else if (i4 == i2) {
                        if (z) {
                            if (z2) {
                                str3 = null;
                            } else {
                                str3 = tabName;
                            }
                            interfaceC1349750lED6.u5(str, str3, true);
                        } else {
                            interfaceC1349750lED6.Pz(str);
                        }
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
