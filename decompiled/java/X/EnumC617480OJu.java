package X;

import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorClosedCreatedAnotherAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorClosedOverTimeAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorInputBaseAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorReopenBottomAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberCloseAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinSubscriberUnSubscribeAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.QuickBulletinCreatorEditAssem;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class EnumC617480OJu {
    public static final EnumC617480OJu BULLETIN_OPEN;
    public static final EnumC617480OJu CREATOR_CLOSED_CAN_REOPEN;
    public static final EnumC617480OJu CREATOR_CLOSED_CREATED_ANOTHER;
    public static final EnumC617480OJu CREATOR_CLOSED_OVER_TIME;
    public static final C0OK0 Companion;
    public static final /* synthetic */ EnumC617480OJu[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC617480OJu NOT_SUBSCRIBED;
    public static final EnumC617480OJu SUBSCRIBED;
    public static final EnumC617480OJu SUBSCRIBER_CLOSED;
    public static final EnumC617480OJu UNINITIALIZED;
    public final EnumC617060OIe LL;
    public final List<EnumC617010OHz> LLILLJJLI;
    public final List<C0OJR> LLILLL;

    public EnumC617480OJu() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC617480OJu> getEntries() {
        return LLILZIL;
    }

    public abstract C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv);

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0OK0] */
    static {
        EnumC617480OJu enumC617480OJu = new EnumC617480OJu() { // from class: X.0OJy
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return null;
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_SUBSCRIBER;
                Collections.singletonList(EnumC617010OHz.CHANNEL_SUBSCRIBED);
                Collections.singletonList(C0OJR.BULLETIN_OPEN_NORMAL);
            }
        };
        SUBSCRIBED = enumC617480OJu;
        EnumC617480OJu enumC617480OJu2 = new EnumC617480OJu() { // from class: X.0OJx
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return C13LE.LIZ(BulletinSubscriberUnSubscribeAssem.class);
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_SUBSCRIBER;
                Collections.singletonList(EnumC617010OHz.CHANNEL_NOT_SUBSCRIBED);
                Collections.singletonList(C0OJR.BULLETIN_OPEN_NORMAL);
            }
        };
        NOT_SUBSCRIBED = enumC617480OJu2;
        EnumC617480OJu enumC617480OJu3 = new EnumC617480OJu() { // from class: X.0OJr
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return C13LE.LIZ(BulletinSubscriberCloseAssem.class);
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_SUBSCRIBER;
                C1697810uHb.LJIIJJI(EnumC617010OHz.CHANNEL_SUBSCRIBED, EnumC617010OHz.CHANNEL_NOT_SUBSCRIBED);
                C1697810uHb.LJIIJJI(C0OJR.CREATOR_CLOSED_CAN_REOPEN, C0OJR.CREATOR_CLOSED_OVER_TIME, C0OJR.CREATOR_CLOSED_CREATED_ANOTHER);
            }
        };
        SUBSCRIBER_CLOSED = enumC617480OJu3;
        EnumC617480OJu enumC617480OJu4 = new EnumC617480OJu() { // from class: X.0OK1
            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_CREATOR;
                Collections.singletonList(EnumC617010OHz.INVALID);
                Collections.singletonList(C0OJR.BULLETIN_OPEN_NORMAL);
            }

            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                Class cls;
                if (c0olv != null && c0olv.LLJ) {
                    return C13LE.LIZ(QuickBulletinCreatorEditAssem.class);
                }
                if (C296830BkH.LIZ()) {
                    cls = BulletinCreatorInputBaseAssem.class;
                } else {
                    cls = BulletinCreatorEditAssem.class;
                }
                return C13LE.LIZ(cls);
            }
        };
        BULLETIN_OPEN = enumC617480OJu4;
        EnumC617480OJu enumC617480OJu5 = new EnumC617480OJu() { // from class: X.0OJs
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return C13LE.LIZ(BulletinCreatorReopenBottomAssem.class);
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_CREATOR;
                Collections.singletonList(EnumC617010OHz.INVALID);
                Collections.singletonList(C0OJR.CREATOR_CLOSED_CAN_REOPEN);
            }
        };
        CREATOR_CLOSED_CAN_REOPEN = enumC617480OJu5;
        EnumC617480OJu enumC617480OJu6 = new EnumC617480OJu() { // from class: X.0OJw
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return C13LE.LIZ(BulletinCreatorClosedOverTimeAssem.class);
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_CREATOR;
                Collections.singletonList(EnumC617010OHz.INVALID);
                Collections.singletonList(C0OJR.CREATOR_CLOSED_OVER_TIME);
            }
        };
        CREATOR_CLOSED_OVER_TIME = enumC617480OJu6;
        EnumC617480OJu enumC617480OJu7 = new EnumC617480OJu() { // from class: X.0OJt
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return C13LE.LIZ(BulletinCreatorClosedCreatedAnotherAssem.class);
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.IDENTITY_CREATOR;
                Collections.singletonList(EnumC617010OHz.INVALID);
                Collections.singletonList(C0OJR.CREATOR_CLOSED_CREATED_ANOTHER);
            }
        };
        CREATOR_CLOSED_CREATED_ANOTHER = enumC617480OJu7;
        EnumC617480OJu enumC617480OJu8 = new EnumC617480OJu() { // from class: X.0OJv
            @Override // X.EnumC617480OJu
            public final C13IQ<? extends UISlotAssem> getAssemClass(C0OLV c0olv) {
                return C13LE.LIZ(BulletinCreatorReopenBottomAssem.class);
            }

            {
                EnumC617060OIe enumC617060OIe = EnumC617060OIe.INVALID;
                Collections.singletonList(EnumC617010OHz.INVALID);
                Collections.singletonList(C0OJR.INVALID);
            }
        };
        UNINITIALIZED = enumC617480OJu8;
        EnumC617480OJu[] enumC617480OJuArr = {enumC617480OJu, enumC617480OJu2, enumC617480OJu3, enumC617480OJu4, enumC617480OJu5, enumC617480OJu6, enumC617480OJu7, enumC617480OJu8};
        LLILZ = enumC617480OJuArr;
        LLILZIL = new C2254308sP(enumC617480OJuArr);
        Companion = new Object() { // from class: X.0OK0
        };
    }

    public static EnumC617480OJu[] values() {
        return (EnumC617480OJu[]) LLILZ.clone();
    }

    public final List<C0OJR> getBulletinAccountStatus() {
        return this.LLILLL;
    }

    public final EnumC617060OIe getIdentityTpe() {
        return this.LL;
    }

    public final List<EnumC617010OHz> getSubscribeStatus() {
        return this.LLILLJJLI;
    }

    public static EnumC617480OJu valueOf(String str) {
        return (EnumC617480OJu) C08FF.LIZ(EnumC617480OJu.class, str);
    }

    public EnumC617480OJu(String str, int i, EnumC617060OIe enumC617060OIe, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = enumC617060OIe;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }
}
