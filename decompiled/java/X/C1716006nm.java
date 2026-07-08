package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo.ChatRoomAlphaVideoViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1716006nm extends C09AY implements Function1<C1603006Pk, Unit> {
    public final /* synthetic */ ChatRoomAlphaVideoViewModel LL;
    public final /* synthetic */ DataSource LLILLJJLI;
    public final /* synthetic */ InterfaceC1715506nh LLILLL;
    public final /* synthetic */ Map<String, Bitmap> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1715706nj LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1716006nm(ChatRoomAlphaVideoViewModel chatRoomAlphaVideoViewModel, DataSource dataSource, InterfaceC1715506nh interfaceC1715506nh, Map<String, Bitmap> map, boolean z, C1715706nj c1715706nj) {
        super(1);
        this.LL = chatRoomAlphaVideoViewModel;
        this.LLILLJJLI = dataSource;
        this.LLILLL = interfaceC1715506nh;
        this.LLILZ = map;
        this.LLILZIL = z;
        this.LLILZLL = c1715706nj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1603006Pk c1603006Pk) {
        if (!c1603006Pk.LL) {
            this.LL.LL.bc(true);
            this.LL.setState(new C1715906nl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        }
        return Unit.LIZ;
    }
}
