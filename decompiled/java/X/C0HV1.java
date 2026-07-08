package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.chatroom.api.popupmanager.IMManagePopupAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS407S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HV1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$subscribeToMixStickerQuickSend$1", f = "ChatroomInputButton.kt", l = {604}, m = "invokeSuspend")
public final class C0HV1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioStatusRepository LLILLJJLI;
    public final /* synthetic */ C1910890zpH LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C05YD<Boolean> LLILZIL;
    public final /* synthetic */ C05YD<Boolean> LLILZLL;
    public final /* synthetic */ IEmojiBtnAbility LLIZ;
    public final /* synthetic */ AbstractC738140SxQ LLIZLLLIL;
    public final /* synthetic */ View LLJ;
    public final /* synthetic */ AtomicReference<C0P0T> LLJI;
    public final /* synthetic */ C01GW<MixStudioLauncher> LLJIJIL;
    public final /* synthetic */ C1559260qg8<C457780HxI> LLJILJIL;
    public final /* synthetic */ C736950SvV<C454050HrH, IMStickerPanelEventViewModel> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HV1(MixStudioStatusRepository mixStudioStatusRepository, C1910890zpH c1910890zpH, String str, C05YD<Boolean> c05yd, C05YD<Boolean> c05yd2, IEmojiBtnAbility iEmojiBtnAbility, AbstractC738140SxQ abstractC738140SxQ, View view, AtomicReference<C0P0T> atomicReference, C01GW<? extends MixStudioLauncher> c01gw, C1559260qg8<C457780HxI> c1559260qg8, C736950SvV<C454050HrH, IMStickerPanelEventViewModel> c736950SvV, InterfaceC1364105Vn<? super C0HV1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioStatusRepository;
        this.LLILLL = c1910890zpH;
        this.LLILZ = str;
        this.LLILZIL = c05yd;
        this.LLILZLL = c05yd2;
        this.LLIZ = iEmojiBtnAbility;
        this.LLIZLLLIL = abstractC738140SxQ;
        this.LLJ = view;
        this.LLJI = atomicReference;
        this.LLJIJIL = c01gw;
        this.LLJILJIL = c1559260qg8;
        this.LLJILJILJ = c736950SvV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HV1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C05RH c05rh = new C05RH(new C1629806Zs(this.LLILLJJLI.LJIILLIIL()));
            final C1910890zpH c1910890zpH = this.LLILLL;
            final String str = this.LLILZ;
            final C05YD<Boolean> c05yd = this.LLILZIL;
            final C05YD<Boolean> c05yd2 = this.LLILZLL;
            final IEmojiBtnAbility iEmojiBtnAbility = this.LLIZ;
            final AbstractC738140SxQ abstractC738140SxQ = this.LLIZLLLIL;
            final View view = this.LLJ;
            final AtomicReference<C0P0T> atomicReference = this.LLJI;
            final C01GW<MixStudioLauncher> c01gw = this.LLJIJIL;
            final C1559260qg8<C457780HxI> c1559260qg8 = this.LLJILJIL;
            final C736950SvV<C454050HrH, IMStickerPanelEventViewModel> c736950SvV = this.LLJILJILJ;
            InterfaceC346701Wf<? super Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0HV0
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    View viewFindViewById;
                    StickerImage stickerImage;
                    List<String> list;
                    String str2;
                    Long l;
                    ViewGroup viewGroupLJIJI;
                    View view2;
                    C05YD<Boolean> c05ydLJFF;
                    StickerItem stickerItem = (StickerItem) obj2;
                    C1910890zpH c1910890zpH2 = c1910890zpH;
                    String str3 = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[quick send] banner status: ");
                    sbLIZ.append(c05yd.getValue().booleanValue());
                    sbLIZ.append(", emoji status: ");
                    sbLIZ.append(c05yd2.getValue().booleanValue());
                    c1910890zpH2.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
                    C01GW<MixStudioLauncher> c01gw2 = c01gw;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457400Hwg.LIZ;
                    MixStudioLauncher value = c01gw2.getValue();
                    if (value != null && (c05ydLJFF = value.LJFF()) != null && c05ydLJFF.getValue().booleanValue()) {
                        return Unit.LIZ;
                    }
                    if (c05yd.getValue().booleanValue()) {
                        return Unit.LIZ;
                    }
                    if (c05yd2.getValue().booleanValue() && (iEmojiBtnAbility.W90().getValue() instanceof C441860HUi)) {
                        c1910890zpH.LIZ(str, "[quick send] try showing quick send sticker");
                        Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI == null || (view2 = fragmentLJI.getView()) == null || (viewFindViewById = view2.findViewById(R.id.k8t)) == null) {
                            viewFindViewById = view;
                        }
                        StickerBase stickerBase = stickerItem.stickerBase;
                        if (stickerBase != null && (stickerImage = stickerBase.image) != null && (list = stickerImage.urlList) != null && (str2 = (String) ListProtector.get(list, 0)) != null) {
                            Context context = abstractC738140SxQ.getContext();
                            if (context == null) {
                                return Unit.LIZ;
                            }
                            StickerBase stickerBase2 = stickerItem.stickerBase;
                            if (stickerBase2 != null && (l = stickerBase2.id) != null) {
                                long jLongValue = l.longValue();
                                AtomicReference<C0P0T> atomicReference2 = atomicReference;
                                MixStudioLauncher value2 = c01gw.getValue();
                                C0P0T c0p0tLIZLLL = null;
                                Boolean boolValueOf = null;
                                if (value2 != null) {
                                    Uri uri = UriProtector.parse(str2);
                                    String strValueOf = String.valueOf(jLongValue);
                                    IMManagePopupAbility iMManagePopupAbility = (IMManagePopupAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMManagePopupAbility.class, null);
                                    if (iMManagePopupAbility != null) {
                                        viewGroupLJIJI = iMManagePopupAbility.LJIJI();
                                    } else {
                                        viewGroupLJIJI = null;
                                    }
                                    C457780HxI value3 = c1559260qg8.getValue();
                                    if (value3 != null) {
                                        boolValueOf = Boolean.valueOf(value3.LLILLJJLI);
                                    }
                                    c0p0tLIZLLL = value2.LIZLLL(context, viewFindViewById, uri, strValueOf, viewGroupLJIJI, boolValueOf, new AwS407S0200000_6(stickerItem, (StickerItem) c736950SvV, (C736950SvV<C454050HrH, IMStickerPanelEventViewModel>) 91));
                                }
                                atomicReference2.set(c0p0tLIZLLL);
                                C0P0T c0p0t = atomicReference.get();
                                if (c0p0t != null) {
                                    c0p0t.show();
                                }
                                return Unit.LIZ;
                            }
                            return Unit.LIZ;
                        }
                        return Unit.LIZ;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c05rh.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.subscribeToMixStickerQuickSend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
