package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516530KNn extends C09AY implements Function1<TemplateInfo, Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516530KNn(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(TemplateInfo templateInfo) {
        boolean z;
        TemplateInfo templateInfo2 = templateInfo;
        if (Intrinsics.LJFF(this.LL, templateInfo2.iapId) && Intrinsics.LJFF(this.LLILLJJLI, templateInfo2.id)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
