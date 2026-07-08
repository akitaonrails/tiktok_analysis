package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS84S1300000_19;

/* JADX INFO: renamed from: X.0iHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1236580iHg extends C2217421BqW implements Function1<MutableLiveData<Boolean>, Unit> {
    public C1236580iHg(Object obj) {
        super(1, obj, C1365110lcz.class, "doInviteLiveEventUser", "doInviteLiveEventUser(Landroidx/lifecycle/MutableLiveData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MutableLiveData<Boolean> mutableLiveData) {
        ILiveEventOuterService iLiveEventOuterServiceK5;
        Long lLIZLLL;
        long jLongValue;
        Long lLIZLLL2;
        MutableLiveData<Boolean> mutableLiveData2 = mutableLiveData;
        C1365110lcz c1365110lcz = (C1365110lcz) this.receiver;
        C436180H8m.LIZIZ(c1365110lcz.LIZIZ);
        List<IMContact> listZQ2 = c1365110lcz.LJII.zQ2();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listZQ2, 10));
        Iterator<IMContact> it2 = listZQ2.iterator();
        while (it2.hasNext()) {
            String uid = it2.next().getUid();
            if (uid != null && (lLIZLLL2 = C1365110lcz.LIZLLL(uid)) != null) {
                jLongValue = lLIZLLL2.longValue();
            } else {
                jLongValue = 0;
            }
            arrayList.add(Long.valueOf(jLongValue));
        }
        String string = c1365110lcz.LIZJ.extras.getString("live_event_id", "");
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) != null) {
            Context context = c1365110lcz.LIZ;
            if (string != null && (lLIZLLL = C1365110lcz.LIZLLL(string)) != null) {
                iLiveEventOuterServiceK5.inviteLiveEventUser(context, lLIZLLL.longValue(), arrayList, C1388190mED.LIZIZ(c1365110lcz.LIZ), new AwS84S1300000_19((MutableLiveData) mutableLiveData2, (MutableLiveData<Boolean>) c1365110lcz, (C1365110lcz) arrayList, (List<Long>) string, (String) 1), new AwS420S0200000_19((MutableLiveData) mutableLiveData2, (MutableLiveData<Boolean>) c1365110lcz, (C1365110lcz) 226));
            }
        }
        return Unit.LIZ;
    }
}
