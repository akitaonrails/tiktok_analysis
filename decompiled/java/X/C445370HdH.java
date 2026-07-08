package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445370HdH extends C09AY implements InterfaceC1631630sYr<Uri, View, C428600GrK, Animatable, Unit> {
    public final /* synthetic */ InterfaceC20236714Gf<InterfaceC343480DdK> LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445370HdH(C2252611DEt c2252611DEt, Effect effect) {
        super(4);
        this.LL = c2252611DEt;
        this.LLILLJJLI = effect;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        if (this.LL.isActive()) {
            InterfaceC20236714Gf<InterfaceC343480DdK> interfaceC20236714Gf = this.LL;
            C343500DdM c343500DdM = new C343500DdM(this.LLILLJJLI);
            C189200o6.m2constructorimpl(c343500DdM);
            interfaceC20236714Gf.resumeWith(c343500DdM);
        }
        return Unit.LIZ;
    }
}
