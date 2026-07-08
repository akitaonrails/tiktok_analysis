package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19590111kh extends C09AY implements Function0<C388890FMp> {
    public final /* synthetic */ AbstractC19589811ke<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19590111kh(AbstractC19589811ke<T> abstractC19589811ke) {
        super(0);
        this.LL = abstractC19589811ke;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C388890FMp invoke() {
        if (this.LL.LIZLLL == null) {
            return null;
        }
        return new C388890FMp(this.LL.LJ().LJIIJJI.getLifecycle(), new AwS573S0100000_29(this.LL, (AbstractC19589811ke<StickerModel>) 1055), new AwS573S0100000_29(this.LL, (AbstractC19589811ke<StickerModel>) 1056));
    }
}
