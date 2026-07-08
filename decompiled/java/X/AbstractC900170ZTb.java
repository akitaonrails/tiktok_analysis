package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseInteractiveTaskTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC900170ZTb<TEMPLATE extends BaseInteractiveTaskTemplate> implements InterfaceC461380I7k {
    public final TEMPLATE LL;
    public final boolean LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZIZ(this, interfaceC1891350zJl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC900170ZTb(BaseInteractiveTaskTemplate baseInteractiveTaskTemplate, boolean z) {
        this.LL = baseInteractiveTaskTemplate;
        this.LLILLJJLI = z;
    }
}
