package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0lij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1368670lij extends InterfaceC20688615xU {
    public static final C1368730lip LJII = C1368730lip.LIZ;

    @Override // X.InterfaceC20688615xU
    void LJJZZIII(String str);

    @Override // X.InterfaceC20688615xU
    void LJL();

    MutableLiveData<List<IMContact>> LJLI();

    MutableLiveData<String> LJLIIIL();

    void LJLIIL(String str);

    MutableLiveData<List<IMContact>> LJLIL();

    MutableLiveData<C1368560liY> LJLILLLLZI();

    MutableLiveData getState();

    @Override // X.InterfaceC20688615xU
    void onCleared();

    @Override // X.InterfaceC20688615xU
    void refresh();
}
