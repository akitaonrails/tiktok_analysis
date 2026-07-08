package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.chatlist.impl.skylight.InboxHorizontalFriendCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Yth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888710Yth extends C09AY implements Function0<C888720Yti> {
    public C888710Yth() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C888720Yti invoke() {
        return new InterfaceC888840Ytu() { // from class: X.0Yti
            @Override // X.InterfaceC888840Ytu
            public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] LIZ() {
                return new Class[]{InboxHorizontalFriendCell.class};
            }
        };
    }
}
