package X;

import android.text.Layout;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SIP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIP extends C09AY implements Function1<Boolean, C719090SIp> {
    public final /* synthetic */ C718780SHk LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ C718800SHm LLILLL;
    public final /* synthetic */ Layout LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SIP(C718780SHk c718780SHk, ViewGroup viewGroup, C718800SHm c718800SHm, Layout layout, boolean z) {
        super(1);
        this.LL = c718780SHk;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = c718800SHm;
        this.LLILZ = layout;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C719090SIp invoke(Boolean bool) {
        boolean z;
        boolean zBooleanValue = bool.booleanValue();
        C718780SHk c718780SHk = this.LL;
        ViewGroup viewGroup = this.LLILLJJLI;
        C718800SHm c718800SHm = this.LLILLL;
        Layout layout = this.LLILZ;
        if (!this.LLILZIL && !zBooleanValue) {
            z = false;
        } else {
            z = true;
        }
        return c718780SHk.LJFF(viewGroup, c718800SHm, layout, z);
    }
}
