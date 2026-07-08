package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ugc.aweme.comment.experiment.CommentSurveyDataItem;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250431D6j {
    public static final C2250431D6j LIZ = new C2250431D6j();
    public static PthreadTimer LIZIZ;
    public static C2250481D6o LIZJ;
    public static SparkContext LIZLLL;
    public static long LJ;
    public static long LJFF;

    public static boolean LJ(Aweme aweme) {
        int i;
        CommentSurveyDataItem commentSurveyDataItemLIZIZ = C1911270zpt.LIZIZ();
        if (commentSurveyDataItemLIZIZ != null) {
            i = commentSurveyDataItemLIZIZ.displayPositionVisibleIndex;
        } else {
            i = -1;
        }
        if (i >= 0 || !C2250441D6k.LIZIZ(aweme)) {
            return false;
        }
        if (C1839820xye.LIZ().LJFF() == 1 || !C161T.LIZ().LIZ() || !C0BJA.LIZIZ() || C0S58.LIZ) {
            return true;
        }
        return false;
    }

    public static void LIZ(int i, Function0 function0) {
        long j;
        if (i != 0) {
            if (i == 1) {
                PthreadTimer pthreadTimer = LIZIZ;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                LIZIZ = null;
                return;
            }
            return;
        }
        if (LIZIZ == null) {
            LIZIZ = new PthreadTimer("LynxPreLayoutManager");
        }
        PthreadTimer pthreadTimer2 = LIZIZ;
        if (pthreadTimer2 == null) {
            return;
        }
        C391480FWo c391480FWo = new C391480FWo(function0, 5);
        CommentSurveyDataItem commentSurveyDataItemLIZIZ = C1911270zpt.LIZIZ();
        if (commentSurveyDataItemLIZIZ != null) {
            j = commentSurveyDataItemLIZIZ.delayTime;
        } else {
            j = 0;
        }
        pthreadTimer2.schedule(c391480FWo, j);
    }

    public static Comment LIZIZ(Aweme aweme, String str) {
        String str2;
        Comment comment = new Comment();
        comment.setAwemeId(str);
        comment.setCommentType(226);
        SparkContext sparkContext = LIZLLL;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        comment.setCid(str2);
        comment.setAliasAweme(aweme);
        comment.setUser(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser());
        return comment;
    }

    public static void LIZJ(Aweme aweme, String str, List list) {
        String aid;
        int i;
        int i2;
        float f;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        System.currentTimeMillis();
        C1361840lXi.LIZ.getClass();
        C1361840lXi.LIZ("handlerSurveyComment v2");
        if (str == null || !str.equals("homepage_hot") || !LJ(aweme)) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        CommentSurveyDataItem commentSurveyDataItemLIZIZ = C1911270zpt.LIZIZ();
        if (commentSurveyDataItemLIZIZ != null) {
            i = commentSurveyDataItemLIZIZ.displayPositionBegin;
        } else {
            i = -1;
        }
        if (size < i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decideLynxIndex=-1, because listSize<begin, listSize=");
            sbLIZ.append(size);
            sbLIZ.append(", begin=");
            sbLIZ.append(i);
            C1361840lXi.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        CommentSurveyDataItem commentSurveyDataItemLIZIZ2 = C1911270zpt.LIZIZ();
        if (commentSurveyDataItemLIZIZ2 != null) {
            i2 = commentSurveyDataItemLIZIZ2.displayPositionEnd;
        } else {
            i2 = -1;
        }
        if (size >= i2) {
            size = i2;
        }
        CommentSurveyDataItem commentSurveyDataItemLIZIZ3 = C1911270zpt.LIZIZ();
        if (commentSurveyDataItemLIZIZ3 != null) {
            f = commentSurveyDataItemLIZIZ3.displayRatio;
        } else {
            f = 0.0f;
        }
        if (!C2250441D6k.LIZ(f)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("decideLynxIndex=-1, because shouldInsert is false, ration=");
            sbLIZ2.append(f);
            C1361840lXi.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (i >= size) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("decideLynxIndex=-1, begin>=end, begin=");
            sbLIZ3.append(i);
            sbLIZ3.append(", end=");
            sbLIZ3.append(size);
            C1361840lXi.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        int iNextInt = C19994513Lb.LIZ(100).nextInt(i, size);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("decideLynxIndex nextInt=");
        sbLIZ4.append(iNextInt);
        C1361840lXi.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        if (iNextInt < 0) {
            return;
        }
        Comment commentLIZIZ = LIZIZ(aweme, aid);
        if (iNextInt < arrayList.size() && (ListProtector.get(list, iNextInt) instanceof C1340820kzo)) {
            iNextInt++;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("handleSurveyComment v2 index=");
        sbLIZ5.append(iNextInt);
        sbLIZ5.append(", size=");
        sbLIZ5.append(arrayList.size());
        C1361840lXi.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        if (iNextInt >= arrayList.size()) {
            arrayList.add(new C1341860l1U(commentLIZIZ, arrayList.size(), aweme));
        } else {
            ListProtector.add(list, iNextInt, new C1341860l1U(commentLIZIZ, iNextInt, aweme));
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.1D6i] */
    public static void LIZLLL(Context context, Aweme aweme, final String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (str2 == null || !str2.equals("homepage_hot") || !C2250441D6k.LIZIZ(aweme)) {
            return;
        }
        System.currentTimeMillis();
        C1361840lXi c1361840lXi = C1361840lXi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preLayout context is null=");
        if (context == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append("，identify=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1361840lXi.getClass();
        C1361840lXi.LIZ(strLIZIZ);
        if (context != null) {
            String strLIZ = C1911270zpt.LIZ();
            C1538140q84 c1538140q84 = C1538140q84.LIZ;
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LIZLLL = false;
            c1538590q8n.LJ = false;
            c1538590q8n.LJFF = false;
            c1538590q8n.LJI = false;
            LIZLLL = c1538140q84.LIZJ(strLIZ, c1538590q8n);
            for (Map.Entry entry : C1354730lMF.LIZ().entrySet()) {
                SparkContext sparkContext = LIZLLL;
                if (sparkContext != null) {
                    sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
                }
            }
            SparkContext sparkContext2 = LIZLLL;
            if (sparkContext2 != null) {
                sparkContext2.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0hcS
                    @Override // X.C1543000qFu
                    public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                        return Collections.singletonList(C1751030vfR.class);
                    }
                });
            }
            if (LIZJ == null) {
                LIZJ = new C2250481D6o(context);
            }
            C1361840lXi c1361840lXi2 = C1361840lXi.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start preLayout hybridContext is null=");
            if (LIZLLL == null) {
                z2 = true;
            }
            sbLIZ2.append(z2);
            sbLIZ2.append("，identify=");
            sbLIZ2.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1361840lXi2.getClass();
            C1361840lXi.LIZ(strLIZIZ2);
            final SparkContext sparkContext3 = LIZLLL;
            if (sparkContext3 != null) {
                LJ = System.currentTimeMillis();
                final C2250481D6o c2250481D6o = LIZJ;
                if (c2250481D6o != null) {
                    final ?? r1 = new InterfaceC2250511D6r<C1537720q7O>() { // from class: X.1D6i
                        @Override // X.InterfaceC2250511D6r
                        public final void LIZ(C0Q8K c0q8k, LynxError lynxError) {
                            Integer numValueOf;
                            C2250431D6j.LJFF = System.currentTimeMillis();
                            C1361840lXi c1361840lXi3 = C1361840lXi.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("error: errorCode = ");
                            String strLIZJ = null;
                            if (lynxError != null) {
                                numValueOf = Integer.valueOf(lynxError.LIZIZ());
                            } else {
                                numValueOf = null;
                            }
                            sbLIZ3.append(numValueOf);
                            sbLIZ3.append(", errorMsg = ");
                            if (lynxError != null) {
                                strLIZJ = lynxError.LIZJ();
                            }
                            sbLIZ3.append(strLIZJ);
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            c1361840lXi3.getClass();
                            C1361840lXi.LIZ(strLIZIZ3);
                        }

                        @Override // X.InterfaceC2250511D6r
                        public final void LIZIZ(InterfaceC647710Par interfaceC647710Par, String str3) {
                            C2250431D6j.LJFF = System.currentTimeMillis();
                            C1361840lXi c1361840lXi3 = C1361840lXi.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("preLayout onLayoutFinish identify=");
                            sbLIZ3.append(str3);
                            sbLIZ3.append(", view = ");
                            sbLIZ3.append(interfaceC647710Par);
                            sbLIZ3.append(", time=");
                            sbLIZ3.append(C2250431D6j.LJFF - C2250431D6j.LJ);
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            c1361840lXi3.getClass();
                            C1361840lXi.LIZ(strLIZIZ3);
                        }
                    };
                    C2250491D6p<C1537720q7O> c2250491D6p = c2250481D6o.LIZIZ;
                    Context context2 = c2250481D6o.LIZ;
                    final CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList = c2250481D6o.LIZJ;
                    AbstractC1539970qB1<C1537720q7O> abstractC1539970qB1 = new AbstractC1539970qB1<C1537720q7O>(sparkContext3, copyOnWriteArrayList) { // from class: X.0qB0
                        public final SparkContext LIZ;
                        public final CopyOnWriteArrayList<C1537720q7O> LIZIZ;

                        @Override // X.AbstractC1539970qB1
                        public final C1537720q7O LIZ(Context context3) {
                            HybridSchemaParam hybridSchemaParamLIZJ;
                            C1537720q7O c1537720q7O;
                            SparkContext sparkContext4 = this.LIZ;
                            C1538140q84 c1538140q842 = C1538140q84.LIZ;
                            C1538590q8n c1538590q8n2 = new C1538590q8n();
                            c1538590q8n2.LIZLLL = false;
                            c1538590q8n2.LJ = false;
                            c1538590q8n2.LJFF = false;
                            c1538590q8n2.LJI = false;
                            C1538140q84.LIZIZ(c1538140q842, sparkContext4, c1538590q8n2, 4);
                            InterfaceC1531560pxS interfaceC1531560pxS = sparkContext4.hybridParams;
                            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
                                if (hybridSchemaParamLIZJ.getThreadStrategy() == 0) {
                                    hybridSchemaParamLIZJ.setThreadStrategy(EnumC665490Q8l.MOST_ON_TASM.id());
                                }
                                C1530570pvr.LJFF(sparkContext4, EnumC1537150q6T.OPT_PRE_LAYOUT_STATUS, 1);
                                InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, this.LIZ, context3, new AbstractC1537870q7d() { // from class: X.0q9F
                                    @Override // X.AbstractC1537870q7d
                                    public final void LJJJZ() {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str3, C1542120qEU c1542120qEU) {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLILLLLZI() {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLJJI() {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void onDestroy() {
                                    }

                                    @Override // X.AbstractC1537870q7d
                                    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str3, String str4) {
                                        LJJZZIII(interfaceC1541990qEH, str3);
                                    }
                                });
                                if ((interfaceC1541990qEHLIZIZ instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ) != null) {
                                    this.LIZIZ.add(c1537720q7O);
                                    return c1537720q7O;
                                }
                            }
                            return null;
                        }

                        {
                            this.LIZ = sparkContext3;
                            this.LIZIZ = copyOnWriteArrayList;
                        }
                    };
                    C2250501D6q c2250501D6q = new C2250501D6q(true);
                    InterfaceC2250511D6r<C1537720q7O> interfaceC2250511D6r = new InterfaceC2250511D6r<C1537720q7O>() { // from class: X.1D6m
                        @Override // X.InterfaceC2250511D6r
                        public final void LIZ(C0Q8K c0q8k, LynxError lynxError) {
                            C2250481D6o c2250481D6o2 = c2250481D6o;
                            SparkContext sparkContext4 = sparkContext3;
                            String str3 = str;
                            c2250481D6o2.getClass();
                            C2250481D6o.LIZLLL("layout", "error", sparkContext4, str3);
                            InterfaceC2250511D6r<C1537720q7O> interfaceC2250511D6r2 = r1;
                            if (interfaceC2250511D6r2 != null) {
                                interfaceC2250511D6r2.LIZ(c0q8k, lynxError);
                            }
                        }

                        @Override // X.InterfaceC2250511D6r
                        /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
                        public final void LIZIZ(C1537720q7O c1537720q7O, String str3) {
                            C2250481D6o c2250481D6o2 = c2250481D6o;
                            SparkContext sparkContext4 = sparkContext3;
                            c2250481D6o2.getClass();
                            C2250481D6o.LIZLLL("layout", "succeed", sparkContext4, str3);
                            InterfaceC2250511D6r<C1537720q7O> interfaceC2250511D6r2 = r1;
                            if (interfaceC2250511D6r2 != null) {
                                interfaceC2250511D6r2.LIZIZ(c1537720q7O, str3);
                            }
                        }
                    };
                    if (c2250491D6p.LJFF) {
                        LynxLog.i("LynxAsyncManager", "LynxAsyncManager is destroyed, cancel all task here.");
                        return;
                    }
                    C1C7U.LIZ("LynxAsyncManager@e24a.preLayout$1L");
                    TraceEvent.LIZLLL("LynxAsyncManager.createContainer");
                    C1537720q7O c1537720q7OLIZ = abstractC1539970qB1.LIZ(context2);
                    TraceEvent.LJII("LynxAsyncManager.createContainer");
                    c2250491D6p.LIZJ(str, c1537720q7OLIZ, c2250501D6q, interfaceC2250511D6r);
                    C1C7U.LIZIZ("LynxAsyncManager@e24a.preLayout$1L");
                }
            }
        }
    }
}
