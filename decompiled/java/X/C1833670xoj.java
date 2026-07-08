package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xoj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1833670xoj extends C2217421BqW implements Function1<Integer, Unit> {
    public C1833670xoj(Object obj) {
        super(1, obj, LiveHighLightPageFragment.class, "onClickDisabledRevive", "onClickDisabledRevive(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) this.receiver;
        final Context context = liveHighLightPageFragment.getContext();
        if (context != null) {
            C1834580xqC c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
            boolean z = true;
            if (c1834580xqCLIZ != null && c1834580xqCLIZ.LL == EnumC1782300wTs.AUTOCUT.getValue()) {
                C766270U4b.LIZLLL(2131855650);
            } else {
                C1834580xqC c1834580xqCLIZ2 = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
                if (c1834580xqCLIZ2 == null || c1834580xqCLIZ2.LLJJJJ != 4) {
                    z = false;
                }
                if (z) {
                    C766270U4b.LIZLLL(2131855660);
                } else if (C1835390xrV.LIZ) {
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJFF(2131855660);
                    c1397580mTM.LIZ(2131855659);
                    C340180DVg.LIZ(c1397580mTM, new FrameLayout(context) { // from class: X.0JjG
                        public final View LL;

                        {
                            List<String> listLJIIJJI;
                            super(context, null, 0);
                            View viewInflate = FrameLayout.inflate(context, R.layout.ddu, this);
                            this.LL = viewInflate;
                            View viewFindViewById = viewInflate.findViewById(R.id.jek);
                            if (C011Z.LIZ.LJIJ(context)) {
                                listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_2", "record_comments_and_gifts_guide_dark.png");
                            } else {
                                listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_2", "record_comments_and_gifts_guide_light.png");
                            }
                            C1143680frq.LJIIJ(viewFindViewById, listLJIIJJI, ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
                        }
                    }, 0, 6);
                    C985403tE.LIZ(c1397580mTM, AFwS269S0000000_27.get$arr$(399));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                } else {
                    C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                    c1397580mTM2.LJFF(2131855660);
                    c1397580mTM2.LIZ(2131855657);
                    C340180DVg.LIZ(c1397580mTM2, new FrameLayout(context) { // from class: X.0JjG
                        public final View LL;

                        {
                            List<String> listLJIIJJI;
                            super(context, null, 0);
                            View viewInflate = FrameLayout.inflate(context, R.layout.ddu, this);
                            this.LL = viewInflate;
                            View viewFindViewById = viewInflate.findViewById(R.id.jek);
                            if (C011Z.LIZ.LJIJ(context)) {
                                listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_2", "record_comments_and_gifts_guide_dark.png");
                            } else {
                                listLJIIJJI = C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_2", "record_comments_and_gifts_guide_light.png");
                            }
                            C1143680frq.LJIIJ(viewFindViewById, listLJIIJJI, ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
                        }
                    }, 0, 6);
                    C985403tE.LIZ(c1397580mTM2, new AwS606S0100000_27(liveHighLightPageFragment, 442));
                    c1397580mTM2.LJII = false;
                    new C1397510mTF(c1397580mTM2).LIZLLL();
                    C1833640xog.LIZ.getClass();
                    C1833640xog.LIZ("show", null);
                }
            }
            C1833640xog.LIZ.getClass();
            C1833640xog.LIZJ("grey", "grey");
        }
        return Unit.LIZ;
    }
}
