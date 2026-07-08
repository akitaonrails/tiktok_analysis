package X;

import Y.AsS35S0100000_8;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569680MVy extends AbstractC569690MVz<RecyclerView.ViewHolder> {
    public final Scene LLILZ;
    public final ViewGroup LLILZIL;
    public final ShortVideoContext LLILZLL;
    public final View LLIZ;
    public RecyclerView LLJI;
    public C416330GUd LLJILJILJ;
    public C0MW3 LLJILLL;
    public C1294720jnS LLJJ;
    public boolean LLJJI;
    public ViewOnLayoutChangeListenerC580910MqP LLJJIII;
    public ViewOnLayoutChangeListenerC580910MqP LLJJIJI;
    public boolean LLJJIJIIJIL;
    public float LLIZLLLIL = C418440Gaw.LIZIZ(12);
    public int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public C0MWA LLJILJIL = C0MWC.LIZ;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1149));
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1475));

    public final void LLLIIIIL() {
        C0MW3 c0mw3;
        C1295960jpS c1295960jpS;
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup == null) {
            return;
        }
        C416330GUd c416330GUd = this.LLJILJILJ;
        if (c416330GUd != null) {
            int visibility = c416330GUd.getVisibility();
            c416330GUd.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c416330GUd);
        }
        ViewOnLayoutChangeListenerC580910MqP viewOnLayoutChangeListenerC580910MqP = this.LLJJIII;
        if (viewOnLayoutChangeListenerC580910MqP != null && (c0mw3 = this.LLJILLL) != null && (c1295960jpS = c0mw3.LLILZ) != null) {
            c1295960jpS.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580910MqP);
        }
        ViewOnLayoutChangeListenerC580910MqP viewOnLayoutChangeListenerC580910MqP2 = this.LLJJIJI;
        if (viewOnLayoutChangeListenerC580910MqP2 != null) {
            viewGroup.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC580910MqP2);
        }
        this.LLJJIII = null;
        this.LLJJIJI = null;
    }

    public static Pair LLLII(C569570MVn c569570MVn) {
        C0MW8 c0mw8LJ;
        String strLIZ;
        String strLIZ2;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        InterfaceC528120KnS interfaceC528120KnSLIZIZ;
        InterfaceC548110Leb interfaceC548110LebLJ;
        String strLIZ3;
        if (C569460MVc.LJIIIIZZ(c569570MVn)) {
            C1425580nCW c1425580nCW = C1425580nCW.LIZIZ;
            Integer numValueOf = Integer.valueOf(R.raw.icon_templates_cards_fill);
            Integer numValueOf2 = Integer.valueOf(R.raw.icon_templates_cards);
            c1425580nCW.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf, numValueOf2), C0MTD.LIZ(2131829636));
        }
        if (C569460MVc.LJII(c569570MVn)) {
            C1425580nCW c1425580nCW2 = C1425580nCW.LIZIZ;
            Integer numValueOf3 = Integer.valueOf(R.raw.icon_image_edit_fill);
            Integer numValueOf4 = Integer.valueOf(R.raw.icon_image_edit);
            c1425580nCW2.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf3, numValueOf4), C0MTD.LIZ(2131833380));
        }
        if (C569460MVc.LJFF(c569570MVn)) {
            C1425580nCW c1425580nCW3 = C1425580nCW.LIZIZ;
            Integer numValueOf5 = Integer.valueOf(R.raw.icon_autocut_clapperboard);
            Integer numValueOf6 = Integer.valueOf(R.raw.icon_clapperboard_star);
            c1425580nCW3.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf5, numValueOf6), C0MTD.LIZ(2131834067));
        }
        C569480MVe c569480MVe = C569480MVe.LIZ;
        String str = c569570MVn.LIZLLL;
        c569480MVe.getClass();
        if (TextUtils.equals(C569480MVe.LIZIZ(str).toLowerCase(Locale.getDefault()), "captions")) {
            C1425580nCW c1425580nCW4 = C1425580nCW.LIZIZ;
            Integer numValueOf7 = Integer.valueOf(R.raw.icon_closed_caption_fill);
            Integer numValueOf8 = Integer.valueOf(R.raw.icon_closed_caption);
            c1425580nCW4.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf7, numValueOf8), C0MTD.LIZ(2131834071));
        }
        if (C569460MVc.LIZIZ(c569570MVn)) {
            C1425580nCW c1425580nCW5 = C1425580nCW.LIZIZ;
            Integer numValueOf9 = Integer.valueOf(R.raw.icon_ai_self);
            Integer numValueOf10 = Integer.valueOf(R.raw.icon_ai_library);
            c1425580nCW5.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf9, numValueOf10), C0MTD.LIZ(2131834064));
        }
        String str2 = "";
        if (C569460MVc.LIZ(c569570MVn)) {
            C1425580nCW c1425580nCW6 = C1425580nCW.LIZIZ;
            Integer numValueOf11 = Integer.valueOf(R.raw.icon_ai_portrait_fill);
            Integer numValueOf12 = Integer.valueOf(R.raw.icon_ai_portrait_fill);
            c1425580nCW6.getClass();
            Object objLIZ = AbstractC1671300taq.LIZ(numValueOf11, numValueOf12);
            IAIPortraitFeatureService.LIZ.getClass();
            IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
            if (iAIPortraitFeatureServiceLIZ != null && (interfaceC548110LebLJ = iAIPortraitFeatureServiceLIZ.LJ()) != null && (strLIZ3 = interfaceC548110LebLJ.LIZ()) != null) {
                str2 = strLIZ3;
            }
            return new Pair(objLIZ, str2);
        }
        if (C569460MVc.LJI(c569570MVn)) {
            C1425580nCW c1425580nCW7 = C1425580nCW.LIZIZ;
            Integer numValueOf13 = Integer.valueOf(R.raw.icon_color_person_cutout);
            Integer numValueOf14 = Integer.valueOf(R.raw.icon_color_person_cutout_dark);
            c1425580nCW7.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf13, numValueOf14), C0MTD.LIZ(2131834073));
        }
        if (TextUtils.equals(c569570MVn.LIZLLL.toLowerCase(Locale.getDefault()), "add_draft")) {
            C1425580nCW c1425580nCW8 = C1425580nCW.LIZIZ;
            Integer numValueOf15 = Integer.valueOf(R.raw.icon_draft_fill);
            Integer numValueOf16 = Integer.valueOf(R.raw.icon_draft);
            c1425580nCW8.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf15, numValueOf16), C0MTD.LIZ(2131832406));
        }
        if (C569460MVc.LJ(c569570MVn)) {
            C1425580nCW c1425580nCW9 = C1425580nCW.LIZIZ;
            Integer numValueOf17 = Integer.valueOf(R.raw.icon_ai_generate_bold);
            Integer numValueOf18 = Integer.valueOf(R.raw.icon_ai_generate);
            c1425580nCW9.getClass();
            Object objLIZ2 = AbstractC1671300taq.LIZ(numValueOf17, numValueOf18);
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService == null || (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) == null || (interfaceC528120KnSLIZIZ = interfaceC1429470nInLJFF.LIZIZ()) == null || (strLIZ2 = interfaceC528120KnSLIZIZ.LIZ()) == null) {
                strLIZ2 = c569570MVn.LIZ;
            }
            return new Pair(objLIZ2, strLIZ2);
        }
        if (C569460MVc.LIZLLL(c569570MVn)) {
            C1425580nCW c1425580nCW10 = C1425580nCW.LIZIZ;
            Integer numValueOf19 = Integer.valueOf(R.raw.icon_ai_videotool_fill);
            Integer numValueOf20 = Integer.valueOf(R.raw.icon_ai_videotool);
            c1425580nCW10.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf19, numValueOf20), C0MTD.LIZ(2131829698));
        }
        if (C569460MVc.LIZJ(c569570MVn)) {
            C1425580nCW c1425580nCW11 = C1425580nCW.LIZIZ;
            Integer numValueOf21 = Integer.valueOf(R.raw.icon_cast_fill);
            Integer numValueOf22 = Integer.valueOf(R.raw.icon_cast_fill);
            c1425580nCW11.getClass();
            Object objLIZ3 = AbstractC1671300taq.LIZ(numValueOf21, numValueOf22);
            IAITheaterFeatureService.LIZ.getClass();
            IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
            if (iAITheaterFeatureServiceLIZ != null && (c0mw8LJ = iAITheaterFeatureServiceLIZ.LJ()) != null && (strLIZ = c0mw8LJ.LIZ()) != null) {
                str2 = strLIZ;
            }
            return new Pair(objLIZ3, str2);
        }
        String str3 = c569570MVn.LIZLLL;
        c569480MVe.getClass();
        if (TextUtils.equals(C569480MVe.LIZIZ(str3).toLowerCase(Locale.getDefault()), "mae_draft_list")) {
            C1425580nCW c1425580nCW12 = C1425580nCW.LIZIZ;
            Integer numValueOf23 = Integer.valueOf(R.raw.icon_ai_insight_fill);
            Integer numValueOf24 = Integer.valueOf(R.raw.icon_ai_insight);
            c1425580nCW12.getClass();
            return new Pair(AbstractC1671300taq.LIZ(numValueOf23, numValueOf24), "MAE Debug");
        }
        return null;
    }

    public final void LLLI(View view) {
        int i;
        int size = this.LL.size();
        if ((!this.LLILZLL.creativeModel.editorProDraftModel.isEoyCreateTabOn || Intrinsics.LJFF(this.LLJILJIL, C0MWC.LIZ)) && this.LLJIJIL <= 0) {
            i = size;
        } else {
            i = size - 1;
        }
        if (i == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = this.LLILLL;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        if (i2 > iLIZIZ2) {
            int i3 = i2 / iLIZIZ;
            if (size <= i3) {
                iLIZIZ2 = i2 / size;
            } else {
                float f = i2;
                int iLIZIZ3 = C814420VxA.LIZIZ(f / (i3 + 0.6f));
                if (iLIZIZ3 < iLIZIZ2) {
                    iLIZIZ2 = C814420VxA.LIZIZ(f / ((i3 - 1) + 0.6f));
                } else {
                    iLIZIZ2 = iLIZIZ3;
                }
            }
        }
        layoutParams.width = iLIZIZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x01d2 A[EDGE_INSN: B:130:0x01d2->B:87:0x01d2 BREAK  A[LOOP:4: B:92:0x01fe->B:132:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[LOOP:4: B:92:0x01fe->B:132:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(java.util.List<X.C569570MVn> r19) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C569680MVy.LLLIILIL(java.util.List):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        AbstractC21674919sB abstractC21674919sB;
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJI = recyclerView;
        this.LLJJIJIIJIL = C426750GoL.LIZLLL(recyclerView.getContext());
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        if (((Boolean) C257080A5q.LIZ.getValue()).booleanValue()) {
            new ContextThemeWrapper(recyclerView.getContext(), R.style.y0);
        }
        recyclerView.addOnScrollListener(new AsS35S0100000_8(this, 9));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (Intrinsics.LJFF(viewHolder, this.LLJILLL)) {
            LLLIIIIL();
            this.LLJILLL = null;
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0mw2;
        if (i == 1) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(C1425580nCW.LIZIZ.LJFF(viewGroup.getContext())), R.layout.epm, viewGroup, false);
            this.LLILZ.requireSceneContext();
            c0mw2 = new C0MW3(viewTd);
        } else {
            c0mw2 = new C0MW2(C786410Ut5.Td(C786410Ut5.ne(C1425580nCW.LIZIZ.LJFF(viewGroup.getContext())), R.layout.epn, viewGroup, false));
        }
        try {
            View view = c0mw2.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0mw2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0mw2.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0mw2.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0mw2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0mw2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0mw2.getClass().getName();
        return c0mw2;
    }

    public static final void LLLIL(ViewGroup viewGroup, C1295960jpS c1295960jpS, C569680MVy c569680MVy) {
        c1295960jpS.getLocationInWindow(new int[2]);
        viewGroup.getLocationInWindow(new int[2]);
        float width = (r3[0] - r2[0]) + ((c1295960jpS.getWidth() * c1295960jpS.getScaleX()) / 2.0f) + c1295960jpS.getTranslationX() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        float height = (r3[1] - r2[1]) + ((c1295960jpS.getHeight() * c1295960jpS.getScaleY()) / 2.0f) + c1295960jpS.getTranslationY();
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76)) / 2.0f;
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) / 2.0f;
        RectF rectF = new RectF(width - fLIZIZ, height - fLIZIZ2, width + fLIZIZ, height + fLIZIZ2);
        C416330GUd c416330GUd = c569680MVy.LLJILJILJ;
        if (c416330GUd != null) {
            float fLIZIZ3 = C418440Gaw.LIZIZ(10);
            c416330GUd.LL = rectF;
            c416330GUd.LLILLJJLI = fLIZIZ3;
            c416330GUd.invalidate();
        }
    }

    public C569680MVy(C569640MVu c569640MVu, ViewGroup viewGroup, ShortVideoContext shortVideoContext, View view) {
        this.LLILZ = c569640MVu;
        this.LLILZIL = viewGroup;
        this.LLILZLL = shortVideoContext;
        this.LLIZ = view;
    }
}
