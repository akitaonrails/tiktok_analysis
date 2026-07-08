package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0aUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937220aUq extends AbstractC960470b6L<C20408114tL> {
    public final LifecycleOwner LL;
    public final InterfaceC937090aUd LLILLJJLI;
    public final C948340amm LLILLL;
    public final LiveIconView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C20441214yg.LIZIZ("PlaybookPolymerizationHeaderTopViewHolderV3", "onBindViewHolder");
    }

    public C937220aUq(View view, PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC937090aUd interfaceC937090aUd) {
        MutableLiveData<Boolean> mutableLiveData;
        super(view);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC937090aUd;
        C948340amm c948340amm = (C948340amm) view.findViewById(R.id.qnu);
        this.LLILLL = c948340amm;
        View viewFindViewById = view.findViewById(R.id.lrd);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.ldz);
        this.LLILZ = liveIconView;
        View viewFindViewById2 = view.findViewById(R.id.qsw);
        this.LLILZIL = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.zlu);
        this.LLILZLL = viewFindViewById3;
        if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            C500260Jjc.LJLJLJ(liveIconView, true);
            C978360bZC.LJIJJ("playbook_original", "create_entrance", null, "create", null, 48);
            if (C500260Jjc.LJJIJLIJ()) {
                RedDotExtensionKt.LJI(viewFindViewById2, lifecycleOwner, null, C0UX6.PLAYBOOK_UGC_ENTRANCE, null);
            }
        } else {
            C500260Jjc.LJLJLJ(liveIconView, false);
        }
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJIJIL) != null) {
            mutableLiveData.observe(this.LL, new Observer() { // from class: X.0aUr
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Boolean) obj).booleanValue() && !C500260Jjc.LJJIL()) {
                        C500260Jjc.LJLJLJ(this.LL.LLILZ, true);
                    } else {
                        if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
                            return;
                        }
                        C500260Jjc.LJLJLJ(this.LL.LLILZ, false);
                    }
                }
            });
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJII("show");
        c948340amm.LLJI = interfaceC937090aUd;
        C941180abE c941180abE = c948340amm.LLJ;
        c941180abE.LJI = dataChannel;
        c941180abE.LJFF.LIZ = dataChannel;
        c941180abE.LIZIZ(C937260aUu.LIZ);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0aUt
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    this.LLILZ.LLILLJJLI.j9();
                }
            }
        }, viewFindViewById);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0aUp
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    this.LLILZ.LLILLJJLI.ab();
                    C978360bZC.LJIJ("playbook_original", "create_entrance", null, "create", false, null, null);
                }
            }
        }, liveIconView);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0aUo
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 != null) {
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    C978360bZC.LJII("click");
                    C937220aUq c937220aUq = this.LLILZ;
                    InterfaceC937090aUd interfaceC937090aUd2 = c937220aUq.LLILLJJLI;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C949720ap0(2, c937220aUq.itemView.getContext().getString(2131854068)));
                    for (C941240abK c941240abK : c937220aUq.LLILLL.getCurrentVisiblePlayToolListItem()) {
                        switch (C936990aUT.LIZ[c941240abK.LIZ.ordinal()]) {
                            case 1:
                                arrayList.add(new C949720ap0(8, c937220aUq.itemView.getContext().getString(2131852903)));
                                break;
                            case 2:
                                arrayList.add(new C949720ap0(5, c937220aUq.itemView.getContext().getString(2131843568)));
                                break;
                            case 3:
                                arrayList.add(new C949720ap0(3, c937220aUq.itemView.getContext().getString(2131853920)));
                                break;
                            case 4:
                                arrayList.add(new C949720ap0(6, c937220aUq.itemView.getContext().getString(2131854020)));
                                break;
                            case 5:
                                arrayList.add(new C949720ap0(7, c937220aUq.itemView.getContext().getString(2131843396)));
                                break;
                            case 6:
                                arrayList.add(new C949720ap0(10, c937220aUq.itemView.getContext().getString(2131854478)));
                                break;
                            case 7:
                                arrayList.add(new C949720ap0(LSPassThroughRecordSizeConfig.DEFAULT, C20642515q3.LJI(2131854430)));
                                break;
                            default:
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("This play tool haven't been added to feed back list, type: ");
                                sbLIZ.append(c941240abK.LIZ);
                                C20441214yg.LJ("PlaybookPolymerizationHeaderTopViewHolderV3", C2188811AlT.LIZIZ(sbLIZ));
                                break;
                        }
                    }
                    arrayList.add(new C949720ap0(1, c937220aUq.itemView.getContext().getString(2131852495)));
                    interfaceC937090aUd2.pe(arrayList);
                }
            }
        }, viewFindViewById3);
    }
}
