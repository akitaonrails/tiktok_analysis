package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CategoryInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse;
import com.ss.android.ugc.aweme.notification.SubscribePanelFragment;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Owh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.SubscribeHelper$tryShowSubscribeCard$1", f = "SubscribeHelper.kt", l = {206}, m = "invokeSuspend")
public final class C635770Owh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ Function1<C1801100wyC, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ List<Integer> LLIZ;
    public final /* synthetic */ C635690OwZ LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C635770Owh(C19EG c19eg, Function1<? super C1801100wyC, Unit> function1, int i, String str, Map<String, String> map, List<Integer> list, C635690OwZ c635690OwZ, InterfaceC1364105Vn<? super C635770Owh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = function1;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = list;
        this.LLIZLLLIL = c635690OwZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C635770Owh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TuxImageModel tuxImageModel;
        String str;
        List<CategoryInfo> listLL;
        boolean zBooleanValue;
        Object objLJI = obj;
        C1C7U.LIZ("SubscribeHelper@2963.tryShowSubscribeCard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C635740Owe c635740Owe = new C635740Owe(this.LLILZ, this.LLIZ, this.LLIZLLLIL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c635740Owe);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1");
                return objLJFF;
            }
        }
        SubscribeInfoResponse subscribeInfoResponse = (SubscribeInfoResponse) objLJI;
        if (!this.LLILLJJLI.isFinishing() && !this.LLILLJJLI.isDestroyed()) {
            if (subscribeInfoResponse == null) {
                Function1<C1801100wyC, Unit> function1 = this.LLILLL;
                if (function1 != null) {
                    function1.invoke(new C1801100wyC(null, null, 10003));
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1");
                return unit;
            }
            if (!subscribeInfoResponse.getCanPopup()) {
                Function1<C1801100wyC, Unit> function12 = this.LLILLL;
                if (function12 != null) {
                    function12.invoke(new C1801100wyC(null, null, 10002));
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1");
                return unit2;
            }
            C635700Owa c635700Owa = C635700Owa.LIZ;
            int i2 = this.LLILZ;
            C19EG c19eg = this.LLILLJJLI;
            String str3 = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            final Function1<C1801100wyC, Unit> function13 = this.LLILLL;
            c635700Owa.getClass();
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = 10001;
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            final SubscribePanelFragment subscribePanelFragment = new SubscribePanelFragment();
            ChannelInfo channelInfo = subscribeInfoResponse.getChannelInfo();
            if (channelInfo != null) {
                tuxImageModel = channelInfo.tuxImageUrl;
            } else {
                tuxImageModel = null;
            }
            ChannelInfo channelInfo2 = subscribeInfoResponse.getChannelInfo();
            if (channelInfo2 != null) {
                str = channelInfo2.name;
            } else {
                str = null;
            }
            subscribePanelFragment.LLILZLL = tuxImageModel;
            subscribePanelFragment.LLIZ = str;
            ChannelInfo channelInfo3 = subscribeInfoResponse.getChannelInfo();
            if (channelInfo3 != null) {
                str2 = channelInfo3.subscribeDesc;
            }
            subscribePanelFragment.LLIZLLLIL = str2;
            List<CategoryInfo> categories = subscribeInfoResponse.getCategories();
            if (categories != null && (listLL = C13LP.LL(categories, 5)) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                for (CategoryInfo categoryInfo : listLL) {
                    int i3 = categoryInfo.label;
                    String str4 = categoryInfo.labelTitle;
                    if (i2 == 666) {
                        if (!Intrinsics.LJFF(C2273401Dyc.LIZLLL, "eu")) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) C0AP3.LIZ.getValue()).booleanValue();
                    }
                    arrayList.add(new C635800Owk(i3, categoryInfo.icon, str4, zBooleanValue));
                }
                subscribePanelFragment.LLJ = arrayList;
            } else {
                subscribePanelFragment.LLJ = Collections.singletonList(new C635800Owk(-1, null, c19eg.getString(2131849502), ((Boolean) C0AP3.LIZ.getValue()).booleanValue()));
            }
            subscribePanelFragment.LLJI = new C635780Owi(subscribePanelFragment, str3, subscribeInfoResponse, map, c19eg, c118300cf, i2, supportFragmentManager);
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str3));
            if (map != null) {
                mapLJIIJ.putAll(map);
            }
            C20684815ws.LJIILLIIL("mini_message_manage_show", mapLJIIJ);
            TuxPanel tuxPanel = new C439850HMp().LIZ;
            tuxPanel.LLJ = true;
            tuxPanel.LLILLJJLI = subscribePanelFragment;
            tuxPanel.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0Owj
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Function1<C1801100wyC, Unit> function14 = function13;
                    if (function14 != null) {
                        int i4 = c118300cf.element;
                        Boolean boolMR = subscribePanelFragment.MR();
                        List<C635800Owk> list = subscribePanelFragment.LLJ;
                        ArrayList<C635800Owk> arrayList2 = new ArrayList();
                        for (C635800Owk c635800Owk : list) {
                            if (c635800Owk.LIZ >= 0) {
                                arrayList2.add(c635800Owk);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        for (C635800Owk c635800Owk2 : arrayList2) {
                            arrayList3.add(new C635810Owl(c635800Owk2.LIZ, c635800Owk2.LIZJ));
                        }
                        function14.invoke(new C1801100wyC(boolMR, arrayList3, i4));
                    }
                }
            };
            tuxPanel.show(this.LLILLJJLI.getSupportFragmentManager(), "SubscribePanel");
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1");
            return unit3;
        }
        Function1<C1801100wyC, Unit> function14 = this.LLILLL;
        if (function14 != null) {
            function14.invoke(new C1801100wyC(null, null, 10003));
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SubscribeHelper@2963.tryShowSubscribeCard$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
