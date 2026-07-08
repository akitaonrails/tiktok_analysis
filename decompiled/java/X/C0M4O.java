package X;

import android.database.Cursor;
import androidx.fragment.app.Fragment;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftPathCollectorKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.a0;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: renamed from: X.0M4O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4O extends C09AY implements Function0<C0M4C> {
    public C0M4O() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0M4C] */
    @Override // kotlin.jvm.functions.Function0
    public final C0M4C invoke() {
        return new InterfaceC557110Lt7() { // from class: X.0M4C
            @Override // X.InterfaceC557110Lt7
            public final C0M5Z LJIIIIZZ() {
                C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(129));
                List<AwemeDraft> listQueryDraftList = queryDraftList(new C0M4J(false, false, null, C0M4F.ALL, null, 119));
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listQueryDraftList, 10));
                Iterator it2 = ((ArrayList) listQueryDraftList).iterator();
                while (it2.hasNext()) {
                    arrayList.add(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJII(((AwemeDraft) it2.next()).LIZIZ()));
                }
                c0m5z.addAll(arrayList);
                c0m5z.add(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJII(C1445850njD.LIZ));
                return c0m5z;
            }

            @Override // X.InterfaceC557110Lt7
            public final boolean LIZ(C558570LvT c558570LvT) {
                CreativeInfo creativeInfo = c558570LvT.LIZ;
                C0M4B c0m4b = new C0M4B(creativeInfo, c558570LvT.LIZIZ, (List) null, 12);
                C118300cf c118300cf = new C118300cf();
                C0M4B c0m4b2 = new C0M4B(creativeInfo, c0m4b.LIZIZ, c0m4b.LIZJ, 8);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" where video_path = '");
                sbLIZ.append(creativeInfo.getCreationId());
                sbLIZ.append('\'');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (c0m4b2.LIZIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" and user_id = '");
                    sbLIZ2.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
                    sbLIZ2.append('\'');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("select exists(select 1 from local_draft");
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" )");
                C0M4A.LJII(C2188811AlT.LIZIZ(sbLIZ3), new AwS587S0100000_8(c118300cf, 730));
                if (c118300cf.element > 0) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC557110Lt7
            public final List<String> LIZIZ(C0M4M c0m4m) {
                C0M4E c0m4e = new C0M4E(null, null, null, c0m4m.LIZ, c0m4m.LIZJ, null, null, null, false, null, 999);
                ArrayList arrayList = new ArrayList();
                List<String> listLJI = C0M4D.LJI(c0m4e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select draft_extras from local_draft");
                sbLIZ.append(C0M4D.LJII(c0m4e, listLJI));
                C0M4A.LJII(C2188811AlT.LIZIZ(sbLIZ), new AwS587S0100000_8(arrayList, (List<MentionDataItem>) 734));
                return arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC557110Lt7
            public final AwemeDraft LIZJ(C0M4L c0m4l) {
                String strLIZIZ;
                String strLIZIZ2;
                String strLIZ;
                String str;
                C259800zU c259800zU = new C259800zU();
                String strLIZIZ3 = C0M4D.LIZIZ(c0m4l.LJ);
                String strLIZIZ4 = "";
                if (!c0m4l.LIZ) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("user_id = ");
                    sbLIZ.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (!c0m4l.LIZJ) {
                    strLIZIZ2 = "";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("video_path not in ");
                    sbLIZ2.append(C0M4D.LJIIJ(C0M4D.LJIIIIZZ()));
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                }
                int i = C562210M3f.LIZ[c0m4l.LIZLLL.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                strLIZ = "visible_to_user = 0";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            strLIZ = C0M4D.LJIIJJI();
                        }
                    } else {
                        strLIZ = "((is_published = 0 or is_published is null) and visible_to_user = 1)";
                    }
                } else {
                    strLIZ = C0M4D.LIZ();
                }
                List listLJIIJJI = C1697810uHb.LJIIJJI(strLIZIZ3, strLIZIZ2, strLIZIZ, strLIZ);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJIIJJI) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(" where ");
                    sbLIZ3.append(C13LP.LJJLIIIJ(arrayList, " and ", null, null, 0, null, null, 62));
                    sbLIZ3.append(' ');
                    strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                int i2 = C562210M3f.LIZIZ[c0m4l.LIZIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "time";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "save_time";
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("select * from local_draft");
                sbLIZ4.append(strLIZIZ4);
                sbLIZ4.append(" order by ");
                sbLIZ4.append(str);
                sbLIZ4.append(" desc LIMIT 1");
                C0M4A.LJII(C2188811AlT.LIZIZ(sbLIZ4), new AwS586S0100000_7(c259800zU, (C259800zU<Fragment>) 550));
                return (AwemeDraft) c259800zU.element;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC557110Lt7
            public final AwemeDraft LIZLLL(String str) {
                C259800zU c259800zU = new C259800zU();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SELECT * FROM local_draft WHERE published_aweme_id = ");
                sbLIZ.append(str);
                sbLIZ.append(" AND ");
                sbLIZ.append(C0M4D.LJIIJJI());
                C0M4A.LJII(C2188811AlT.LIZIZ(sbLIZ), new AwS586S0100000_7(c259800zU, (C259800zU<Fragment>) 549));
                return (AwemeDraft) c259800zU.element;
            }

            @Override // X.InterfaceC557110Lt7
            public final List<AwemeDraft> LJFF(C0M4K c0m4k) {
                String strLIZIZ;
                String strLIZ;
                String strLIZIZ2;
                String str;
                ArrayList arrayList = new ArrayList();
                List<CreativeInfo> list = c0m4k.LIZ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<CreativeInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getCreationId());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("video_path in ");
                sbLIZ.append(C0M4D.LJIIJ(arrayList2));
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
                String strLIZIZ4 = "";
                if (!c0m4k.LIZIZ) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("user_id = ");
                    sbLIZ2.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                int i = C562210M3f.LIZ[c0m4k.LIZLLL.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                strLIZ = "visible_to_user = 0";
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            strLIZ = C0M4D.LJIIJJI();
                        }
                    } else {
                        strLIZ = "((is_published = 0 or is_published is null) and visible_to_user = 1)";
                    }
                } else {
                    strLIZ = C0M4D.LIZ();
                }
                String strLIZIZ5 = C0M4D.LIZIZ(c0m4k.LJ);
                if (!c0m4k.LJFF) {
                    strLIZIZ2 = "";
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("video_path not in ");
                    sbLIZ3.append(C0M4D.LJIIJ(C0M4D.LJIIIIZZ()));
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                List listLJIIJJI = C1697810uHb.LJIIJJI(strLIZIZ3, strLIZIZ2, strLIZIZ, strLIZ, strLIZIZ5);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : listLJIIJJI) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(" where ");
                    sbLIZ4.append(C13LP.LJJLIIIJ(arrayList3, " and ", null, null, 0, null, null, 62));
                    sbLIZ4.append(' ');
                    strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                }
                int i2 = C562210M3f.LIZIZ[c0m4k.LIZJ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "time";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "save_time";
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("select * from local_draft");
                sbLIZ5.append(strLIZIZ4);
                sbLIZ5.append(" order by ");
                sbLIZ5.append(str);
                sbLIZ5.append(" desc");
                C0M4A.LJII(C2188811AlT.LIZIZ(sbLIZ5), new AwS586S0100000_7((List) arrayList, (List<GameDrawerCategory>) 551));
                return arrayList;
            }

            @Override // X.InterfaceC557110Lt7
            public final AwemeDraft LJI(C558570LvT c558570LvT) {
                List listLJIIIIZZ;
                CreativeInfo creativeInfo = c558570LvT.LIZ;
                boolean z = c558570LvT.LIZIZ;
                if (c558570LvT.LIZJ) {
                    listLJIIIIZZ = C0M4D.LJIIIIZZ();
                } else {
                    listLJIIIIZZ = C13BV.INSTANCE;
                }
                return C0M4A.LIZJ(new C0M4B(creativeInfo, z, (List<String>) listLJIIIIZZ, c558570LvT.LIZLLL));
            }

            @Override // X.InterfaceC557110Lt7
            public final C0M5Z LJII(AwemeDraft awemeDraft) {
                return DraftPathCollectorKt.LIZJ(awemeDraft);
            }

            @Override // X.InterfaceC557110Lt7
            public final Pair<List<AwemeDraft>, Exception> LJIIIZ(C0M4J c0m4j) {
                List listLJIIIIZZ;
                boolean z = c0m4j.LIZ;
                if (c0m4j.LIZIZ) {
                    listLJIIIIZZ = C0M4D.LJIIIIZZ();
                } else {
                    listLJIIIIZZ = C13BV.INSTANCE;
                }
                C0M4E c0m4e = new C0M4E(null, null, listLJIIIIZZ, z, c0m4j.LIZJ, c0m4j.LIZLLL, null, null, false, null, 963);
                Function1<AwemeDraft, Boolean> function1 = c0m4j.LJ;
                ArrayList arrayList = new ArrayList();
                String strLIZJ = C0M4D.LIZJ(c0m4e);
                try {
                    C0M45.LIZ.getClass();
                    C0M45.LIZLLL();
                    e = null;
                    Cursor cursorRawQuery = SQLiteHelper.getInstance().getReadableDatabase().rawQuery(strLIZJ, null);
                    C0M4H.LIZ(c0m4e);
                    while (C0M4A.LIZIZ(cursorRawQuery)) {
                        AwemeDraft awemeDraftLIZ = C0MZJ.LIZ(cursorRawQuery);
                        if (function1 != null) {
                            if (function1.invoke(awemeDraftLIZ).booleanValue()) {
                                arrayList.add(awemeDraftLIZ);
                            }
                        } else {
                            arrayList.add(awemeDraftLIZ);
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
                return new Pair<>(arrayList, e);
            }

            @Override // X.InterfaceC557110Lt7
            public final String getSaveDate(AwemeDraft awemeDraft) {
                return new BDDateFormat("L").LIZIZ(awemeDraft.saveTime, Locale.getDefault());
            }

            @Override // X.InterfaceC557110Lt7
            public final int queryDraftCount(C0M4M c0m4m) {
                return C0M4A.LIZLLL(new C0M4E(null, null, null, c0m4m.LIZ, c0m4m.LIZJ, null, c0m4m.LIZLLL, null, false, null, 935));
            }

            @Override // X.InterfaceC557110Lt7
            public final List<AwemeDraft> queryDraftList(C0M4J c0m4j) {
                List listLJIIIIZZ;
                boolean z = c0m4j.LIZ;
                if (c0m4j.LIZIZ) {
                    listLJIIIIZZ = C0M4D.LJIIIIZZ();
                } else {
                    listLJIIIIZZ = C13BV.INSTANCE;
                }
                return C0M4A.LJ(new C0M4E(null, null, listLJIIIIZZ, z, c0m4j.LIZJ, c0m4j.LIZLLL, null, null, false, null, 963), c0m4j.LJ);
            }

            @Override // X.InterfaceC557110Lt7
            public final List<C561420M0e> queryDraftMetaList(C0M4J c0m4j) {
                List listLJIIIIZZ;
                String str;
                EnumC562200M3e enumC562200M3eLJ = C0M4D.LJ();
                boolean z = c0m4j.LIZ;
                if (c0m4j.LIZIZ) {
                    listLJIIIIZZ = C0M4D.LJIIIIZZ();
                } else {
                    listLJIIIIZZ = C13BV.INSTANCE;
                }
                C0M4E c0m4e = new C0M4E(enumC562200M3eLJ, null, listLJIIIIZZ, z, c0m4j.LIZJ, c0m4j.LIZLLL, null, null, false, null, 962);
                ArrayList arrayList = new ArrayList();
                List<String> listLJI = C0M4D.LJI(c0m4e);
                int i = C562210M3f.LIZJ[c0m4e.LIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            str = "time";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str = "save_time";
                    }
                } else {
                    str = "free_up_space";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select video_path, save_time, time from local_draft");
                sbLIZ.append(C0M4D.LJII(c0m4e, listLJI));
                sbLIZ.append(" order by ");
                sbLIZ.append(str);
                sbLIZ.append(" desc");
                C0M4A.LJII(C2188811AlT.LIZIZ(sbLIZ), new AwS587S0100000_8(arrayList, (List<MentionDataItem>) 735));
                return arrayList;
            }

            @Override // X.InterfaceC557110Lt7
            public final C553680Lna queryDraftsInfo(C0M4M c0m4m) {
                boolean z;
                C0M4N c0m4n;
                if (C0C64.LJIILLIIL().LJIJ(31744, 1, "draft_box_count_and_size", true) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                AwemeDraft awemeDraft = null;
                if (z && !c0m4m.LIZIZ) {
                    Pair<List<AwemeDraft>, Long> pairLJFF = C0M4A.LJFF(new C0M4E(null, null, null, c0m4m.LIZ, c0m4m.LIZJ, null, null, null, c0m4m.LJ, null, 743), null);
                    return new C553680Lna(pairLJFF.getFirst().size(), (AwemeDraft) C13LP.LJJJLL(pairLJFF.getFirst()), pairLJFF.getSecond().longValue(), 60);
                }
                int iLIZLLL = C0M4A.LIZLLL(new C0M4E(null, null, null, c0m4m.LIZ, c0m4m.LIZJ, null, null, null, c0m4m.LJ, null, 743));
                if (!c0m4m.LIZIZ) {
                    EnumC562200M3e enumC562200M3eLJ = C0M4D.LJ();
                    boolean z2 = c0m4m.LIZ;
                    boolean z3 = c0m4m.LJ;
                    if (z3) {
                        c0m4n = null;
                    } else {
                        c0m4n = new C0M4N(0, 1, 0);
                    }
                    awemeDraft = (AwemeDraft) C13LP.LJJJLL(C0M4A.LJ(new C0M4E(enumC562200M3eLJ, c0m4n, null, z2, c0m4m.LIZJ, null, null, null, z3, null, 740), null));
                }
                return new C553680Lna(iLIZLLL, awemeDraft, 0L, 124);
            }

            @Override // X.InterfaceC557110Lt7
            public final Exception LJ(C0M4J c0m4j, AwS374S0200000_8 awS374S0200000_8) {
                List listLJIIIIZZ;
                boolean z = c0m4j.LIZ;
                if (c0m4j.LIZIZ) {
                    listLJIIIIZZ = C0M4D.LJIIIIZZ();
                } else {
                    listLJIIIIZZ = C13BV.INSTANCE;
                }
                Exception e = null;
                C0M4E c0m4e = new C0M4E(null, null, listLJIIIIZZ, z, c0m4j.LIZJ, c0m4j.LIZLLL, null, null, false, null, 963);
                Function1<AwemeDraft, Boolean> function1 = c0m4j.LJ;
                String strLIZJ = C0M4D.LIZJ(c0m4e);
                try {
                    C0M45.LIZ.getClass();
                    C0M45.LIZLLL();
                    Cursor cursorRawQuery = SQLiteHelper.getInstance().getReadableDatabase().rawQuery(strLIZJ, null);
                    C0M4H.LIZ(c0m4e);
                    while (C0M4A.LIZIZ(cursorRawQuery)) {
                        AwemeDraft awemeDraftLIZ = C0MZJ.LIZ(cursorRawQuery);
                        if (function1 != null) {
                            if (function1.invoke(awemeDraftLIZ).booleanValue()) {
                                awS374S0200000_8.invoke(awemeDraftLIZ);
                            }
                        } else {
                            awS374S0200000_8.invoke(awemeDraftLIZ);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
                return e;
            }

            @Override // X.InterfaceC557110Lt7
            public final List<AwemeDraft> queryDraftsInfoWithLimited(C0M4M c0m4m, int i) {
                return C0M4A.LJ(new C0M4E(C0M4D.LJ(), new C0M4N(0, i, 0), null, c0m4m.LIZ, c0m4m.LIZJ, null, c0m4m.LIZLLL, null, false, null, 932), null);
            }
        };
    }
}
