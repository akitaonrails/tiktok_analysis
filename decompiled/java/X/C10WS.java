package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10WS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public interface C10WS {
    void Iq(PNSFeedbackModel pNSFeedbackModel, Function1<? super Integer, Unit> function1);

    void Kq(String str);

    void Kz(boolean z);

    MutableLiveData<Integer> MM();

    LiveData<C19258510Vz> Un();

    MutableLiveData<Unit> bJ();

    void er(String str);

    LiveData<Boolean> iz();

    void jF(boolean z);

    void lu(C19299010eq c19299010eq);

    LiveData<Date> mD();

    void qh();
}
