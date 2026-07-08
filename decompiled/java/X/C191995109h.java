package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.ValuedAccountPrivacySettingItemModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.109h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191995109h extends AbstractC192006109s implements InterfaceC191997109j {
    public final String LIZLLL;
    public final String LJ;
    public InterfaceC1631620sYq<? super C109T, ? super View, ? super Integer, Boolean> LJFF;
    public InterfaceC1631620sYq<? super C109T, ? super Context, ? super String, String> LJI;
    public C103N LJII;
    public InterfaceC1631630sYr<? super ValuedAccountPrivacySettingItemModel, ? super Integer, ? super Integer, ? super BaseResponse, Unit> LJIIIZ;
    public final List<C191976108o> LJIIIIZZ = new ArrayList();
    public final AFwS271S0000000_28 LJIIJ = AFwS271S0000000_28.get$arr$(293);
    public Function1<? super Boolean, Boolean> LJIIJJI = AFwS271S0000000_28.get$arr$(294);

    @Override // X.InterfaceC191997109j
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC191996109i
    public final InterfaceC1631620sYq<C109T, View, Integer, Unit> LJFF() {
        return null;
    }

    @Override // X.InterfaceC191997109j
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC191997109j
    public final InterfaceC1631630sYr<ValuedAccountPrivacySettingItemModel, Integer, Integer, BaseResponse, Unit> LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC191996109i
    public final InterfaceC1631620sYq<C109T, View, Integer, Boolean> LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC191996109i
    public final InterfaceC1631620sYq<C109T, Context, String, String> LJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC191996109i
    public final String LJI() {
        return this.LIZLLL;
    }

    public C191995109h(String str, String str2) {
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
