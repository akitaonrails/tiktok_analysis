package X;

import Y.ACListenerS165S0100000_31;
import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class DialogC20428314wb extends AbstractDialogC962810bA7 {
    public static DialogC20428314wb LLJJJIL;
    public final Function2<String, Boolean, Unit> LLJI;
    public final C01GW LLJIJIL;
    public TuxTextView LLJILJIL;
    public RunnableC781530UlD LLJILJILJ;
    public RunnableC781530UlD LLJILLL;
    public C1117360fBO LLJJ;
    public C1117360fBO LLJJI;
    public int LLJJIII;
    public C20427614wU LLJJIJI;
    public C20427614wU LLJJIJIIJIL;
    public int LLJJIJIL;
    public C20428414wc LLJJJ;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g_5;
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ((IHostCreativeTool) this.LLJIJIL.getValue()).BJ0(this.LLJJJ);
        super.dismiss();
    }

    public final void LJL(C20427614wU c20427614wU) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleClickBaseItem: ");
        sbLIZ.append(c20427614wU);
        C20441214yg.LIZIZ("NoticeBoardPicturePickerDialog", C2188811AlT.LIZIZ(sbLIZ));
        if (!c20427614wU.LIZIZ) {
            LJLI(c20427614wU);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI(X.C20427614wU r8) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC20428314wb.LJLI(X.14wU):void");
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.14wc] */
    @Override // X.AbstractDialogC962810bA7, X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        boolean z;
        super.onCreate(bundle);
        ((C0GUM) findViewById(R.id.tsc)).e0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.db0);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 6));
            tuxTextView.setText(2131853945);
        }
        TextView textView = (TextView) findViewById(R.id.title);
        if (textView != null) {
            textView.setText(2131853940);
        }
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.g31);
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS165S0100000_31(this, 7));
            tuxTextView2.setText(2131853938);
        }
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.svj);
        this.LLJILJIL = tuxTextView3;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(2131853939);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_down;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.ewy);
            tuxTextView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, c419910GdJ.LIZ(getContext()), (Drawable) null);
            tuxTextView3.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C500260Jjc.LJLIIIL(2000L, tuxTextView3, new AwS610S0100000_31(this, 3));
        }
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) findViewById(R.id.sik);
        this.LLJILJILJ = runnableC781530UlD;
        if (runnableC781530UlD != null) {
            C1117360fBO c1117360fBO = new C1117360fBO();
            final AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 4);
            c1117360fBO.LLLI(C20427714wV.class, new AbstractC960460b6K<C20427714wV, C20427514wT>(awS610S0100000_31) { // from class: X.14wW
                public final Function1<C20427614wU, Unit> LIZIZ;

                {
                    this.LIZIZ = awS610S0100000_31;
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C20427514wT(C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(viewGroup.getContext())), R.layout.hk_, viewGroup, false), this.LIZIZ);
                }

                @Override // X.C0J8P
                public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                    AbstractC960470b6L abstractC960470b6L = (AbstractC960470b6L) viewHolder;
                    C20427614wU c20427614wU = (C20427614wU) obj;
                    View viewFindViewById = abstractC960470b6L.itemView.findViewById(R.id.bwa);
                    Object objLJJJLL = C13LP.LJJJLL(list);
                    int i = 0;
                    if (objLJJJLL != null && objLJJJLL.equals(EnumC1984707q1.SELECTION)) {
                        if (viewFindViewById != null) {
                            if (!c20427614wU.LIZIZ) {
                                i = 4;
                            }
                            C786410Ut5.LJLLLLLL(i, viewFindViewById);
                            return;
                        }
                        return;
                    }
                    abstractC960470b6L.I5(abstractC960470b6L.getAdapterPosition(), c20427614wU);
                }
            });
            this.LLJJ = c1117360fBO;
            runnableC781530UlD.setLayoutManager(new StaggeredGridLayoutManager(5, 1));
            runnableC781530UlD.setAdapter(this.LLJJ);
            ArrayList arrayList = new ArrayList();
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, arrayList, 1);
            AwS432S0200000_31 awS432S0200000_312 = new AwS432S0200000_31(this, arrayList, 2);
            multiCanvasUtils.getClass();
            MultiCanvasUtils.LIZJ(awS432S0200000_31, awS432S0200000_312);
        }
        RunnableC781530UlD runnableC781530UlD2 = (RunnableC781530UlD) findViewById(R.id.ipl);
        this.LLJILLL = runnableC781530UlD2;
        if (runnableC781530UlD2 != null) {
            C500260Jjc.LJIILIIL(runnableC781530UlD2);
            C1117360fBO c1117360fBO2 = new C1117360fBO();
            final AwS610S0100000_31 awS610S0100000_312 = new AwS610S0100000_31(this, 5);
            c1117360fBO2.LLLI(C20427614wU.class, new AbstractC960460b6K<C20427614wU, C20428014wY>(awS610S0100000_312) { // from class: X.14wX
                public final Function1<C20427614wU, Unit> LIZIZ;

                {
                    this.LIZIZ = awS610S0100000_312;
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    View viewTd = C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(viewGroup.getContext())), R.layout.hkm, viewGroup, false);
                    ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
                    int iLJIIZILJ = C497740JfY.LJIIZILJ() / 3;
                    layoutParams.width = iLJIIZILJ;
                    layoutParams.height = iLJIIZILJ;
                    C786410Ut5.W5(viewTd, layoutParams);
                    return new C20428014wY(viewTd, this.LIZIZ);
                }

                @Override // X.C0J8P
                public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
                    AbstractC960470b6L abstractC960470b6L = (AbstractC960470b6L) viewHolder;
                    C20427614wU c20427614wU = (C20427614wU) obj;
                    Object objLJJJLL = C13LP.LJJJLL(list);
                    if (objLJJJLL != null && objLJJJLL.equals(EnumC1984707q1.SELECTION)) {
                        ((C1841350y17) abstractC960470b6L.itemView.findViewById(R.id.sp_)).setChecked(c20427614wU.LIZIZ);
                    } else {
                        abstractC960470b6L.I5(abstractC960470b6L.getAdapterPosition(), c20427614wU);
                    }
                }
            });
            this.LLJJI = c1117360fBO2;
            runnableC781530UlD2.setLayoutManager(new GridLayoutManager(getContext(), 3));
            runnableC781530UlD2.setAdapter(this.LLJJI);
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            runnableC781530UlD2.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0DXi
                public final int LLILLJJLI;
                public final int LL = 3;
                public final boolean LLILLL = false;

                {
                    this.LLILLJJLI = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    int i = this.LL;
                    int i2 = childAdapterPosition % i;
                    if (this.LLILLL) {
                        int i3 = this.LLILLJJLI;
                        rect.left = i3 - ((i2 * i3) / i);
                        rect.right = ((i2 + 1) * i3) / i;
                        if (childAdapterPosition < i) {
                            rect.top = i3;
                        }
                        rect.bottom = i3;
                        return;
                    }
                    int i4 = this.LLILLJJLI;
                    rect.left = (i2 * i4) / i;
                    rect.right = i4 - (((i2 + 1) * i4) / i);
                    if (childAdapterPosition < i) {
                        return;
                    }
                    rect.top = i4;
                }
            });
        }
        C16FS c16fs = (C16FS) findViewById(R.id.f780poa);
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS165S0100000_31(this, 8));
            c16fs.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, getContext()));
            c16fs.setBackgroundColor(C497740JfY.LIZLLL(R.attr.ev1, getContext()));
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        if (C838410Wul.LIZ(context, str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RunnableC781530UlD runnableC781530UlD3 = this.LLJILLL;
            if (runnableC781530UlD3 != null) {
                C500260Jjc.LLFFF(runnableC781530UlD3);
            }
            View viewFindViewById = findViewById(R.id.q_5);
            if (viewFindViewById != null) {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
            C013C c013c = new C013C();
            c013c.element = true;
            MultiCanvasUtils multiCanvasUtils2 = MultiCanvasUtils.LIZ;
            AwS432S0200000_31 awS432S0200000_313 = new AwS432S0200000_31(this, c013c, 3);
            multiCanvasUtils2.getClass();
            MultiCanvasUtils.LIZJ(awS432S0200000_313, null);
            TuxTextView tuxTextView4 = this.LLJILJIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setClickable(true);
            }
        } else {
            RunnableC781530UlD runnableC781530UlD4 = this.LLJILLL;
            if (runnableC781530UlD4 != null) {
                C500260Jjc.LJIILIIL(runnableC781530UlD4);
            }
            View viewFindViewById2 = findViewById(R.id.q_5);
            if (viewFindViewById2 != null) {
                C500260Jjc.LLFFF(viewFindViewById2);
            }
            TuxTextView tuxTextView5 = this.LLJILJIL;
            if (tuxTextView5 != null) {
                tuxTextView5.setClickable(false);
            }
            this.LLJJIJIL++;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        this.LLJJJ = new C14E9() { // from class: X.14wc
            @Override // X.C14E9
            public final void LLLLLLLLL(String str2, String str3, String str4) {
            }

            @Override // X.C14E9
            public final void f(List<String> list) {
            }

            @Override // X.C14E9
            public final void LLZLI(String str2) throws Throwable {
                boolean z2;
                int i;
                Boolean boolValueOf;
                Object objLJJJLZIJ;
                C20427614wU c20427614wU;
                ArrayList arrayList2;
                List<?> list;
                DialogC20428314wb dialogC20428314wb = this.LIZ;
                MultiCanvasUtils multiCanvasUtils3 = MultiCanvasUtils.LIZ;
                Context context2 = C915980Zwa.LIZJ().context();
                if (str2 == null) {
                    str2 = "";
                }
                multiCanvasUtils3.getClass();
                String strLJIIL = MultiCanvasUtils.LJIIL(context2, str2);
                dialogC20428314wb.getClass();
                if (strLJIIL.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C20441214yg.LIZIZ("NoticeBoardPicturePickerDialog", "onSelectFromGallery: path is null or empty");
                    return;
                }
                C118300cf c118300cf = new C118300cf();
                C1117360fBO c1117360fBO3 = dialogC20428314wb.LLJJI;
                if (c1117360fBO3 != null && (list = c1117360fBO3.LL) != null) {
                    i = 0;
                    for (Object obj : list) {
                        if ((obj instanceof C20427614wU) && Intrinsics.LJFF(((C20427614wU) obj).LIZ, strLJIIL)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                c118300cf.element = i;
                C1117360fBO c1117360fBO4 = dialogC20428314wb.LLJJI;
                Boolean boolValueOf2 = null;
                if (c1117360fBO4 != null) {
                    if (i == -1) {
                        c118300cf.element = Math.min(4, c1117360fBO4.LL.size());
                        C20427614wU c20427614wU2 = new C20427614wU(strLJIIL, false);
                        List<?> list2 = c1117360fBO4.LL;
                        if ((list2 instanceof C410901il) && (arrayList2 = (ArrayList) list2) != null) {
                            arrayList2.add(c118300cf.element, c20427614wU2);
                        }
                        c1117360fBO4.notifyItemInserted(c118300cf.element);
                        dialogC20428314wb.LLJJIII = c118300cf.element;
                        dialogC20428314wb.LJLI(c20427614wU2);
                    } else {
                        List<?> list3 = c1117360fBO4.LL;
                        if (list3 != null) {
                            objLJJJLZIJ = C13LP.LJJJLZIJ(i, list3);
                        } else {
                            objLJJJLZIJ = null;
                        }
                        if ((objLJJJLZIJ instanceof C20427614wU) && (c20427614wU = (C20427614wU) objLJJJLZIJ) != null) {
                            dialogC20428314wb.LJLI(c20427614wU);
                        }
                    }
                    RunnableC781530UlD runnableC781530UlD5 = dialogC20428314wb.LLJILLL;
                    if (runnableC781530UlD5 != null) {
                        HandlerHook.viewPost(runnableC781530UlD5, new ARunnableS100S0200000_31(dialogC20428314wb, c118300cf, 3));
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("targetPhotoItemIndex: ");
                sbLIZ.append(c118300cf.element);
                sbLIZ.append(": isAnimating: ");
                RunnableC781530UlD runnableC781530UlD6 = dialogC20428314wb.LLJILLL;
                if (runnableC781530UlD6 != null) {
                    boolValueOf = Boolean.valueOf(runnableC781530UlD6.isAnimating());
                } else {
                    boolValueOf = null;
                }
                sbLIZ.append(boolValueOf);
                sbLIZ.append(", layouting: ");
                RunnableC781530UlD runnableC781530UlD7 = dialogC20428314wb.LLJILLL;
                if (runnableC781530UlD7 != null) {
                    boolValueOf2 = Boolean.valueOf(runnableC781530UlD7.isComputingLayout());
                }
                sbLIZ.append(boolValueOf2);
                C20441214yg.LIZIZ("NoticeBoardPicturePickerDialog", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        ((IHostCreativeTool) this.LLJIJIL.getValue()).Aq1(c19egLIZIZ, this.LLJJJ);
    }

    public DialogC20428314wb(Context context, Function2 function2) {
        super(context);
        this.LLJI = function2;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(20));
        this.LLJJIII = -1;
    }
}
