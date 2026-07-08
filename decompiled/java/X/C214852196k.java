package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.196k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214852196k extends C09AY implements Function1<C0LAB, C0LAB> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214852196k(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0LAB invoke(C0LAB c0lab) {
        String str;
        C0LAB c0lab2 = c0lab;
        c0lab2.LJ("action_method", "drag");
        if (this.LL > this.LLILLJJLI) {
            str = "left";
        } else {
            str = "right";
        }
        c0lab2.LJ("action_type", str);
        return c0lab2;
    }
}
