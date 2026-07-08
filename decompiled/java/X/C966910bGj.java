package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0bGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966910bGj extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966910bGj(long j, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        Avatar avatar = new Avatar();
        long j = this.LL;
        String str = this.LLILLJJLI;
        avatar.avatarId = j;
        interfaceC965990bFF.LJJLIIIJILLIZJL(avatar, str);
        return Unit.LIZ;
    }
}
