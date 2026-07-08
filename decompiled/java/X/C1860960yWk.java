package X;

import android.view.View;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS303S0000000_19;

/* JADX INFO: renamed from: X.0yWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860960yWk implements InterfaceC1860950yWj, InterfaceC1587906Jp {
    public final /* synthetic */ List<TakoVideoItem> LL;
    public final /* synthetic */ INimbleVideoListDependAbility LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C14OU LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    @Override // X.InterfaceC1860950yWj
    public final String LJIIIIZZ() {
        String str = this.LLILLL;
        if (str != null) {
            return str;
        }
        INimbleVideoListDependAbility iNimbleVideoListDependAbility = this.LLILLJJLI;
        if (iNimbleVideoListDependAbility != null) {
            return iNimbleVideoListDependAbility.getMessageId();
        }
        return null;
    }

    @Override // X.InterfaceC1860950yWj
    public final boolean LJIILIIL() {
        Boolean bool = this.LLILZLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // X.InterfaceC1860950yWj
    public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
        return AFwS303S0000000_19.get$arr$(50);
    }

    @Override // X.InterfaceC1860950yWj
    public final C1920507ff getUiConfig() {
        INimbleVideoListDependAbility iNimbleVideoListDependAbility = (INimbleVideoListDependAbility) C1558520qew.LIZ(LIZIZ(), INimbleVideoListDependAbility.class, null);
        if (iNimbleVideoListDependAbility != null) {
            return iNimbleVideoListDependAbility.fy2(this.LLILZIL);
        }
        return null;
    }

    @Override // X.InterfaceC1860950yWj
    public final List<TakoVideoItem> getVideoList() {
        List<TakoVideoItem> list = this.LL;
        if (list != null) {
            return list;
        }
        INimbleVideoListDependAbility iNimbleVideoListDependAbility = this.LLILLJJLI;
        if (iNimbleVideoListDependAbility != null) {
            return iNimbleVideoListDependAbility.getVideoList();
        }
        return null;
    }

    public C1860960yWk(List<TakoVideoItem> list, INimbleVideoListDependAbility iNimbleVideoListDependAbility, String str, C14OU c14ou, Integer num, Boolean bool) {
        this.LL = list;
        this.LLILLJJLI = iNimbleVideoListDependAbility;
        this.LLILLL = str;
        this.LLILZ = c14ou;
        this.LLILZIL = num;
        this.LLILZLL = bool;
    }
}
