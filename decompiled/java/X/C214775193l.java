package X;

import Y.ACallableS422S0100000_16;
import Y.AObjectS249S0100000_32;
import Y.AfS185S0100000_16;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.193l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214775193l extends C193N<InterfaceC214729191r, C190T, C10J1> implements InterfaceC214729191r {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final Scene LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final C01GW LLJIJIL;
    public final List<C19223110Ij> LLJILJIL;
    public final List<C19223110Ij> LLJILJILJ;
    public final List<C19223110Ij> LLJILLL;
    public InterfaceC420801kM LLJJ;
    public Animator LLJJI;
    public final InterfaceC1738600vLO LLJJIII;
    public final C10J3 LLJJIJI;
    public final Function0<C190T> LLJJIJIIJIL;
    public final C10J1 LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214775193l.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C214775193l.class, "publishOptionsManagerApi", "getPublishOptionsManagerApi()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C214775193l.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJJIL = 8;
    }

    private final List<InterfaceC1738600vLO> P4() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = C13LP.LLIIII(this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C19223110Ij) it2.next()).LJIILIIL);
        }
        Iterator it3 = C13LP.LLIIII(this.LLJILJILJ).iterator();
        while (it3.hasNext()) {
            arrayList.add(((C19223110Ij) it3.next()).LJIILIIL);
        }
        Iterator it4 = C13LP.LLIIII(this.LLJILLL).iterator();
        while (it4.hasNext()) {
            arrayList.add(((C19223110Ij) it4.next()).LJIILIIL);
        }
        return arrayList;
    }

    private final VideoPublishEditModel d5() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJJJ[2]);
    }

    private final C193M k5() {
        return (C193M) this.LLJ.getValue(this, LLJJJ[1]);
    }

    public final C19EG T4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJJ[0]);
    }

    public final C1002270cBl Z4() {
        return (C1002270cBl) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[PHI: r2
      0x00b9: PHI (r2v3 boolean) = (r2v2 boolean), (r2v5 boolean) binds: [B:47:0x00b6, B:37:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC861810XrP n5() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214775193l.n5():X.0XrP");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC420801kM interfaceC420801kM = this.LLJJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        Animator animator = this.LLJJI;
        if (animator != null) {
            animator.cancel();
        }
        super.onDestroy();
    }

    public final void t5() {
        C19EG c19egT4 = T4();
        Scene scene = this.LLIZ;
        final C193M c193mK5 = k5();
        C214776193m c214776193m = new C214776193m(c19egT4, scene, c193mK5);
        List<C19223110Ij> list = this.LLJILJIL;
        List<C19223110Ij> list2 = this.LLJILJILJ;
        List<C19223110Ij> list3 = this.LLJILLL;
        ArrayList<C19223110Ij> arrayList = c214776193m.LIZIZ;
        arrayList.clear();
        if (!list.isEmpty()) {
            arrayList.add(new C19223110Ij(LSPassThroughRecordSizeConfig.DEFAULT, c19egT4.getString(2131838653), 60));
            arrayList.addAll(list);
        }
        if (!list2.isEmpty()) {
            arrayList.add(new C19223110Ij(LSPassThroughRecordSizeConfig.DEFAULT, c19egT4.getString(2131838655), 60));
            arrayList.addAll(list2);
        }
        if (!list3.isEmpty()) {
            arrayList.add(new C19223110Ij(LSPassThroughRecordSizeConfig.DEFAULT, c19egT4.getString(2131838664), 60));
            arrayList.addAll(list3);
        }
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 270);
        FrameLayout frameLayout = new FrameLayout(C545820Lau.LIZ(c19egT4, scene)) { // from class: X.06V5
            {
                super(context);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bft, this, true);
                TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.p15);
                if (tuxNavBar != null) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
                    if (numLIZJ != null) {
                        tuxNavBar.setNavBackground(numLIZJ.intValue());
                    }
                    C0OM1 c0om1 = new C0OM1();
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131838636);
                    c0om1.LIZJ = c1250250idj;
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_x_mark;
                    c1251150ifB.LIZLLL = true;
                    c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1149));
                    c0om1.LIZIZ(c1251150ifB);
                    tuxNavBar.setNavActions(c0om1);
                    tuxNavBar.LJIIZILJ(true);
                }
            }
        };
        final ArrayList<C19223110Ij> arrayList2 = c214776193m.LIZIZ;
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.fwc);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            final LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(recyclerView.getContext());
            recyclerView.setAdapter(lifecycleOwnerLIZIZ != null ? new AbstractC21673619ry<RecyclerView.ViewHolder>(lifecycleOwnerLIZIZ, arrayList2, c193mK5) { // from class: X.10Ip
                public final LifecycleOwner LL;
                public final List<? extends C19223110Ij> LLILLJJLI;
                public final C193M LLILLL;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LLILLJJLI.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i) {
                    int i2 = ((C19223110Ij) ListProtector.get(this.LLILLJJLI, i)).LIZ;
                    if (i2 == 1003) {
                        C19223110Ij c19223110Ij = (C19223110Ij) ListProtector.get(this.LLILLJJLI, i);
                        Pair<Class<Object>, Class<Object>> pair = c19223110Ij.LJIIJJI;
                        if (pair != null) {
                            return this.LLILLL.IN(pair.getFirst(), pair.getSecond(), c19223110Ij.LJIILJJIL);
                        }
                        throw new IllegalArgumentException("alsDataType is null");
                    }
                    return i2;
                }

                @Override // X.AbstractC21673619ry
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    super.onViewAttachedToWindow(viewHolder);
                    if (viewHolder instanceof AbstractC1738640vLS) {
                        this.LLILLL.JF1((AbstractC1738640vLS) viewHolder);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                    super.onViewRecycled(viewHolder);
                    if (viewHolder instanceof AbstractC1738640vLS) {
                        this.LLILLL.M42((AbstractC1738640vLS) viewHolder);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    if (viewHolder instanceof AbstractC1738640vLS) {
                        C19223110Ij c19223110Ij = (C19223110Ij) ListProtector.get(this.LLILLJJLI, i);
                        Pair<? extends C1664690tQB<Object>, ? extends Object> pair = c19223110Ij.LJIIL;
                        if ((pair instanceof Pair) && pair != null) {
                            this.LLILLL.q61(this.LL, c19223110Ij.LJIILIIL, (AbstractC1738640vLS) viewHolder, pair.getFirst(), pair.getSecond());
                            return;
                        }
                        return;
                    }
                    if (viewHolder instanceof C0TK3) {
                        ((C0TK3) viewHolder).LL.setText(((C19223110Ij) ListProtector.get(this.LLILLJJLI, i)).LIZIZ);
                    } else {
                        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    RecyclerView.ViewHolder viewHolderKe1;
                    if (i == 1000) {
                        viewHolderKe1 = new C0TK3(viewGroup);
                    } else {
                        viewHolderKe1 = this.LLILLL.ke1(i, viewGroup);
                        if (viewHolderKe1 == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Not support viewType=");
                            sbLIZ.append(i);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    try {
                        View view = viewHolderKe1.itemView;
                        if (view != null) {
                            view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    viewHolderKe1.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (viewHolderKe1.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(viewHolderKe1.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) viewHolderKe1.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(viewHolderKe1.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = viewHolderKe1.getClass().getName();
                    return viewHolderKe1;
                }

                {
                    this.LL = lifecycleOwnerLIZIZ;
                    this.LLILLJJLI = arrayList2;
                    this.LLILLL = c193mK5;
                }
            } : null);
            final Context context = recyclerView.getContext();
            recyclerView.addItemDecoration(new C0DXR(context, arrayList2) { // from class: X.0GqQ
                public final List<C19223110Ij> LL;
                public final C01GW LLILLJJLI;
                public final C01GW LLILLL;
                public final C01GW LLILZ;

                {
                    this.LL = arrayList2;
                    EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
                    this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(context, 1411));
                    this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(context, 1410));
                    this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(context, 1409));
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.C0DXR
                public final void LIZJ(Canvas canvas, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    String str;
                    Iterator it2 = new C462910IDh(recyclerView2, 4).iterator();
                    while (true) {
                        C462890IDf c462890IDf = (C462890IDf) it2;
                        if (c462890IDf.hasNext()) {
                            View view = (View) c462890IDf.next();
                            C19223110Ij c19223110Ij = (C19223110Ij) C13LP.LJJJLZIJ(recyclerView2.getChildAdapterPosition(view), this.LL);
                            if (c19223110Ij != null && (str = c19223110Ij.LJIILL) != null) {
                                switch (str.hashCode()) {
                                    case 49:
                                        if (str.equals("1")) {
                                            Drawable drawable = (Drawable) this.LLILLJJLI.getValue();
                                            drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                                            drawable.draw(canvas);
                                        }
                                        break;
                                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                        if (str.equals("2")) {
                                            Drawable drawable2 = (Drawable) this.LLILZ.getValue();
                                            drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                                            drawable2.draw(canvas);
                                        }
                                        break;
                                    case 51:
                                        if (str.equals("3")) {
                                            Drawable drawable3 = (Drawable) this.LLILLL.getValue();
                                            drawable3.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                                            drawable3.draw(canvas);
                                        }
                                        break;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view, recyclerView2, c21673919s1);
                }
            });
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = frameLayout;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.a1b, c19egT4);
        c1390920mIc.LJIIIIZZ(0);
        DialogInterfaceOnDismissListenerC21523619Le dialogInterfaceOnDismissListenerC21523619Le = new DialogInterfaceOnDismissListenerC21523619Le(awS576S0100000_32, 5);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC21523619Le;
        tuxSheet2.show(C20622515mp.LJIILL(c19egT4, scene), "AddContentLabelComponent");
    }

    public final void v5() {
        InterfaceC420801kM interfaceC420801kM = this.LLJJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJ = C11NZ.LJJJJI(new ACallableS422S0100000_16(this, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 11), new C09JN() { // from class: X.0bzU
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AddContentLabelComponent@a79.showGuideIfNeed$3");
                C1C7U.LIZIZ("AddContentLabelComponent@a79.showGuideIfNeed$3");
            }
        });
    }

    public final void x5() {
        i3(new AwS611S0100000_32(this, 87));
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        k5().yg2(C10K2.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 0));
        k5().yg2(C193G.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 1));
        k5().yg2(C10K4.LIZ).LIZ(this, new AObjectS249S0100000_32(this, 2));
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJIJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJIII;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJIJI;
    }

    public C10J1 O4() {
        return this.LLJJIJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C19223110Ij> K4(List<? extends C19223110Ij> list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C19223110Ij c19223110Ij = (C19223110Ij) obj;
                if (list.size() == 1) {
                    c19223110Ij.LJIILL = "3";
                } else if (i == 0) {
                    c19223110Ij.LJIILL = "1";
                } else if (i == list.size() - 1) {
                    c19223110Ij.LJIILL = "2";
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return list;
    }

    public C214775193l(C1DRG c1drg, Scene scene) {
        super(c1drg);
        this.LLIZ = scene;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJIJIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(84));
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = new ArrayList();
        this.LLJJIII = EnumC214771193h.ADD_CONTENT_LABEL;
        this.LLJJIJI = AnonymousClass1937.LIZ;
        this.LLJJIJIIJIL = new AwS576S0100000_32(this, 269);
        this.LLJJIJIL = new C10J1(new AwS611S0100000_32(this, 85), new AwS611S0100000_32(this, 86));
    }
}
