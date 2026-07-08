package X;

import Y.AObserverS206S0100000_2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.dm.DMNotificationViewModel;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ztN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913430ztN extends C09AY implements Function1<C103L, Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ MutableLiveData<Integer> LLILZLL;
    public final /* synthetic */ MutableLiveData<Integer> LLIZ;
    public final /* synthetic */ MutableLiveData<Integer> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1913430ztN(C19EG c19eg, Bundle bundle, int i, int i2, String str, MutableLiveData<Integer> mutableLiveData, MutableLiveData<Integer> mutableLiveData2, MutableLiveData<Integer> mutableLiveData3, String str2) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = bundle;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str;
        this.LLILZLL = mutableLiveData;
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = mutableLiveData3;
        this.LLJ = str2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C103L c103l) {
        final LifecycleOwner lifecycleOwnerLJIIL;
        Fragment fragmentLJIIL;
        final C103L c103l2 = c103l;
        final C19EG c19eg = this.LL;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService == null || (lifecycleOwnerLJIIL = iPrivacySettingsDepService.LJIIL()) == null) {
            lifecycleOwnerLJIIL = this.LL;
        }
        final Bundle bundle = this.LLILLJJLI;
        FrameLayout frameLayout = new FrameLayout(c19eg, c19eg, lifecycleOwnerLJIIL, c103l2, bundle) { // from class: X.0ztU
            {
                C104A next;
                C191852103u c191852103u;
                super(c19eg);
                View viewInflate = FrameLayout.inflate(new ContextThemeWrapper(c19eg, R.style.ry), R.layout.bej, this);
                C786410Ut5.W5(viewInflate, new RecyclerView.LayoutParams(-1, -2));
                Iterator<? extends C104A> it2 = c103l2.LJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next instanceof C191852103u) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C104A c104a = next;
                if (c104a != null && (c104a instanceof C191852103u) && (c191852103u = (C191852103u) c104a) != null) {
                    c191852103u.LJFF = false;
                }
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c19eg, 1, false);
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.ms4);
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setItemAnimator(null);
                C106V.LIZ.getClass();
                TPSCRenderManager tPSCRenderManagerLIZJ = C106V.LIZJ();
                C191848103q c191848103q = new C191848103q(new ContextThemeWrapper(c19eg, R.style.ry), c19eg, lifecycleOwnerLJIIL, c103l2.LIZ, bundle, null, null, 224);
                List<? extends C104A> list = c103l2.LJ;
                tPSCRenderManagerLIZJ.getClass();
                recyclerView.setAdapter(TPSCRenderManager.LIZJ(c191848103q, list));
            }
        };
        C259800zU c259800zU = new C259800zU();
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.w1;
        c770750ULh.LIZ = c0hti.LIZ(this.LL);
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = this.LL.getString(this.LLILLL);
        c770750ULh.LJFF = this.LL.getString(this.LLILZ);
        c770750ULh.LJIILL = frameLayout;
        c770750ULh.LJIILLIIL = false;
        c770750ULh.LJI(this.LL.getString(2131830782), new C1726706pV(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LL, c259800zU));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        c1390920mIcLIZIZ.LJIIIIZZ(4);
        ?? r4 = c1390920mIcLIZIZ.LIZ;
        r4.LLJLLL = true;
        final MutableLiveData<Integer> mutableLiveData = this.LLILZLL;
        final MutableLiveData<Integer> mutableLiveData2 = this.LLIZ;
        final MutableLiveData<Integer> mutableLiveData3 = this.LLIZLLLIL;
        r4.LL = new DialogInterface.OnCancelListener() { // from class: X.0zuV
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C191880104w.LIZ.getClass();
                PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
                if (privacyUserSettingsV2LJIIL != null) {
                    MutableLiveData<Integer> mutableLiveData4 = mutableLiveData;
                    MutableLiveData<Integer> mutableLiveData5 = mutableLiveData2;
                    MutableLiveData<Integer> mutableLiveData6 = mutableLiveData3;
                    if (mutableLiveData4 != null) {
                        mutableLiveData4.setValue(privacyUserSettingsV2LJIIL.LIZ("dm_setting_friends"));
                    }
                    if (mutableLiveData5 != null) {
                        mutableLiveData5.setValue(privacyUserSettingsV2LJIIL.LIZ("dm_setting_potential_connection"));
                    }
                    if (mutableLiveData6 != null) {
                        mutableLiveData6.setValue(privacyUserSettingsV2LJIIL.LIZ("dm_setting_others"));
                    }
                }
            }
        };
        c259800zU.element = r4;
        r4.show(this.LL.getSupportFragmentManager(), "PrivacySettingSheet");
        ViewModel viewModel = new ViewModelProvider(this.LL).get((Class<ViewModel>) DMNotificationViewModel.class);
        LifecycleOwner lifecycleOwner = this.LL;
        LiveData liveData = (LiveData) ((DMNotificationViewModel) viewModel).LL.getValue();
        IPrivacySettingsDepService iPrivacySettingsDepService2 = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService2 != null && (fragmentLJIIL = iPrivacySettingsDepService2.LJIIL()) != null) {
            lifecycleOwner = fragmentLJIIL;
        }
        liveData.observe(lifecycleOwner, new AObserverS206S0100000_2(c259800zU, 9));
        return Unit.LIZ;
    }
}
