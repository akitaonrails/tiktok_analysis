package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0r1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572660r1k implements Serializable, InterfaceC111300bX {
    public static final int $stable = 8;
    public final String LL;
    public final Aweme LLILLJJLI;
    public final int LLILLL;
    public final Collection<IMUser> LLILZ;
    public final InterfaceC1631620sYq<List<InteractionTagUserInfo>, Boolean, Boolean, Unit> LLILZIL;

    public C1572660r1k() {
        this(null, null, 0, null, null, 31, null);
    }

    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    public final String getEnterFrom() {
        return this.LL;
    }

    public final int getPermission() {
        return this.LLILLL;
    }

    public final InterfaceC1631620sYq<List<InteractionTagUserInfo>, Boolean, Boolean, Unit> getTagPanelOnDismiss() {
        return this.LLILZIL;
    }

    public final Collection<IMUser> getTagged() {
        return this.LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1572660r1k(String str, Aweme aweme, int i, Collection<? extends IMUser> collection, InterfaceC1631620sYq<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LL = str;
        this.LLILLJJLI = aweme;
        this.LLILLL = i;
        this.LLILZ = collection;
        this.LLILZIL = interfaceC1631620sYq;
    }

    public C1572660r1k(String str, Aweme aweme, int i, Collection collection, InterfaceC1631620sYq interfaceC1631620sYq, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : aweme, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : collection, (i2 & 16) == 0 ? interfaceC1631620sYq : null);
    }
}
