package X;

import X.AbstractC19933412yy;
import java.util.List;

/* JADX INFO: renamed from: X.12z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public interface InterfaceC19933912z3<MessageT extends AbstractC19933412yy<MessageT>> extends InterfaceC19933112yv {
    @Override // X.InterfaceC19933112yv, X.InterfaceC19916512wF
    InterfaceC19930912yZ getDefaultInstanceForType();

    <T> T getExtension(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg);

    <T> T getExtension(AbstractC19925412xg<? extends MessageT, List<T>> abstractC19925412xg, int i);

    <T> int getExtensionCount(AbstractC19925412xg<? extends MessageT, List<T>> abstractC19925412xg);

    <T> boolean hasExtension(AbstractC19925412xg<? extends MessageT, T> abstractC19925412xg);
}
