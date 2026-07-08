package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877370YbP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ EnumC885270Yo9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877370YbP(boolean z, EnumC885270Yo9 enumC885270Yo9, String str, InterfaceC879010Ye3 interfaceC879010Ye3, List<String> list, Activity activity, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = enumC885270Yo9;
        this.LLILLL = str;
        this.LLILZ = interfaceC879010Ye3;
        this.LLILZIL = list;
        this.LLILZLL = activity;
        this.LLIZ = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EnumC885270Yo9 undoActionType;
        if (this.LL && (undoActionType = this.LLILLJJLI.getUndoActionType()) != null) {
            C877320YbK c877320YbK = C877320YbK.LIZ;
            String str = this.LLILLL;
            InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILZ;
            List<String> list = this.LLILZIL;
            String singleTargetMobValue = undoActionType.getSingleTargetMobValue();
            c877320YbK.getClass();
            C1729806q0.LIZ(interfaceC879010Ye3, new C061G(interfaceC879010Ye3, str, singleTargetMobValue, list, null, true));
            c877320YbK.LIZLLL(this.LLILZLL, undoActionType, this.LLILZ, this.LLILLL, this.LLILZIL, null, this.LLIZ, false);
            C885310YoD.LIZ.LJ(this.LLILZIL.size(), this.LLILLL, "toast_undo", undoActionType.getBatchActionTypeMobValue(), C877320YbK.LJIIJ(this.LLILZ));
        }
        return Unit.LIZ;
    }
}
