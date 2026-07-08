package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ded, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C344290Ded extends C2217421BqW implements Function1<IMContact, Unit> {
    public C344290Ded(Object obj) {
        super(1, obj, C344280Dec.class, "onClick", "onClick(Lcom/ss/android/ugc/aweme/im/contacts/api/model/IMContact;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IMContact iMContact) {
        Function1<IMContact, Unit> function1 = ((C344280Dec) this.receiver).LL;
        if (function1 != null) {
            function1.invoke(iMContact);
        }
        return Unit.LIZ;
    }
}
