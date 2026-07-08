package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969470bKr implements InterfaceC969510bKv {
    public final MutableLiveData<Long> LIZ = new MutableLiveData<>();
    public final MutableLiveData<List<C954460awe>> LIZIZ = new MutableLiveData<>();
    public final List<C954460awe> LIZJ = new ArrayList();
    public final MutableLiveData<Long> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<List<C954460awe>> LJ = new MutableLiveData<>();
    public final MutableLiveData<List<C954460awe>> LJFF = new MutableLiveData<>();
    public final MutableLiveData<Map<Long, Boolean>> LJI = new MutableLiveData<>();
    public final MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> LJII = new MutableLiveData<>();

    @Override // X.InterfaceC969510bKv
    public final void onCleared() {
        this.LIZ.setValue(null);
        this.LIZIZ.setValue(null);
        this.LIZLLL.setValue(null);
        this.LJ.setValue(null);
        this.LJFF.setValue(null);
        this.LJI.setValue(null);
        this.LJII.setValue(null);
    }

    public C969470bKr() {
        new C098J();
    }
}
