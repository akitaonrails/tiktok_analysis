package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.json.JSONException;

/* JADX INFO: renamed from: X.109S, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C109S extends C109T {
    public final C191848103q LLIZ;
    public final C191991109d LLIZLLLIL;
    public final C191983108v LLJ;
    public final ViewModelStoreOwner LLJI;
    public final LifecycleOwner LLJIJIL;

    @Override // X.C109T, X.InterfaceC191831102z
    public final /* bridge */ /* synthetic */ CharSequence LIZJ(Context context, CharSequence charSequence) {
        return null;
    }

    @Override // X.C109T
    public final String LJIILL(Context context) {
        return null;
    }

    public final boolean LJIJI() {
        List<PrivacySettingsRestrictionOption> list;
        if (!this.LLIZLLLIL.LJIILJJIL || (list = LJIILLIIL().values) == null) {
            return false;
        }
        Iterator<PrivacySettingsRestrictionOption> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().showType == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        CharSequence charSequenceLJI;
        boolean z;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIILLIIL());
        boolean z2 = c191986108yLIZLLL.LIZ;
        if (!this.LLIZLLLIL.LJII.invoke(Boolean.valueOf(c191986108yLIZLLL.LIZIZ)).booleanValue()) {
            return arrayList;
        }
        C191991109d c191991109d = this.LLIZLLLIL;
        Integer num = c191991109d.LIZLLL;
        CharSequence charSequenceLJI2 = LJI(c191991109d.LJ, context);
        C103N c103n = this.LLIZLLLIL.LJFF;
        CharSequence charSequenceLJI3 = null;
        if (c103n != null) {
            charSequenceLJI = LJI(c103n, context);
        } else {
            charSequenceLJI = null;
        }
        C191844103m c191844103m = this.LLIZLLLIL.LJIIIZ;
        if (c191844103m != null) {
            charSequenceLJI3 = LJI(c191844103m, context);
        }
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 207);
        AwS607S0100000_28 awS607S0100000_282 = new AwS607S0100000_28(this, 208);
        if (this.LLIZLLLIL.LJI.invoke(Boolean.valueOf(z2)).booleanValue() && !LJIJI()) {
            z = true;
        } else {
            z = false;
        }
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 719);
        this.LLIZLLLIL.getClass();
        C10FB c10fb = new C10FB(num, charSequenceLJI2, charSequenceLJI, charSequenceLJI3, awS607S0100000_28, awS607S0100000_282, z, false, false, false, false, awS572S0100000_28, 3968);
        this.LLJ.LIZJ = Boolean.valueOf(c10fb.LJIIIIZZ);
        arrayList.add(c10fb);
        return arrayList;
    }

    public C109S(C191848103q c191848103q, C191991109d c191991109d) {
        PrivacyUserSettingDataViewModel privacyUserSettingDataViewModelLIZ;
        MutableLiveData<Integer> mutableLiveData;
        super(c191991109d, c191848103q);
        this.LLIZ = c191848103q;
        this.LLIZLLLIL = c191991109d;
        this.LLJ = new C191983108v(c191991109d.LIZ, "Disclosure");
        ViewModelStoreOwner viewModelStoreOwner = c191848103q.LIZIZ;
        this.LLJI = viewModelStoreOwner;
        this.LLJIJIL = c191848103q.LIZJ;
        String str = c191991109d.LJIIJ;
        if (str != null && (privacyUserSettingDataViewModelLIZ = AnonymousClass1093.LIZ(viewModelStoreOwner, str)) != null && (mutableLiveData = privacyUserSettingDataViewModelLIZ.LLILLL) != null) {
            mutableLiveData.observe(this.LLJIJIL, new AObserverS230S0100000_28(this, 66));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.C109T
    public final void LJIJ(int i, View view) throws JSONException, AnonymousClass1080 {
        Bundle bundle;
        String str = this.LLIZLLLIL.LJIIL;
        if (str != null) {
            TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
            Context context = view.getContext();
            ?? r0 = this.LLIZLLLIL.LJIILIIL;
            if (r0 != 0) {
                bundle = (Bundle) r0.invoke(this);
            } else {
                bundle = null;
            }
            tPSCRenderManager.getClass();
            TPSCRenderManager.LJFF(context, str, bundle);
        }
        super.LJIJ(i, view);
    }
}
