package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C929660aIe extends C2217421BqW implements Function0<Unit> {
    public C929660aIe(Object obj) {
        super(0, obj, DialogC929590aIX.class, "dismiss", "dismiss()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C19GI c19gi = (C19GI) this.receiver;
        c19gi.dismiss();
        C785410UrT.LIZ(c19gi);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.LIZ;
    }
}
