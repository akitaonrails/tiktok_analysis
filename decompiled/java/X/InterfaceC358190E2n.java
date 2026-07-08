package X;

import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0E2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC358190E2n extends C05YF {
    LiveData<Map<String, List<ResourceItem>>> Ar2();

    void Qc0(List<C357590E0f> list);

    LiveEvent<Unit> RD1();

    String RM();

    void So2(EnumC357140DzM enumC357140DzM);

    void fl0(String str, List<? extends ResourceItem> list);

    LiveData<String> gm();

    void k8(String str);

    void nV();

    LiveEvent<ResourceItem> nf0();

    void oF(EnumC357140DzM enumC357140DzM);

    void wH2(ResourceItem resourceItem);

    LiveData<String> xF2();

    void xY0(String str);
}
