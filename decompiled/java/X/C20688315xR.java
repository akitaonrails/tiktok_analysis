package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15xR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20688315xR extends C2217421BqW implements Function1<IMContact, Unit> {
    public C20688315xR(Object obj) {
        super(1, obj, SystemShareFragment.class, "onSendToDM", "onSendToDM(Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMContact;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IMContact iMContact) {
        ((SystemShareFragment) this.receiver).UR(iMContact);
        return Unit.LIZ;
    }
}
