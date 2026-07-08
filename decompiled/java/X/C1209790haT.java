package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0haT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209790haT implements InterfaceC1603360rpG, C0PDP {
    public final InterfaceC1603360rpG LL;
    public List<Aweme> LLILLJJLI;

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return null;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return this.LLILLJJLI;
    }

    public C1209790haT(InterfaceC1603360rpG interfaceC1603360rpG) {
        this.LL = interfaceC1603360rpG;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return this.LL.getPageType(i);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        Serializable serializable;
        List listSingletonList;
        ArrayList arrayList = null;
        if (C286220BJs.LIZ()) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("save_aweme");
            } else {
                serializable = null;
            }
            if ((serializable instanceof Aweme) && serializable != null && (listSingletonList = Collections.singletonList(serializable)) != null) {
                arrayList = new ArrayList(listSingletonList);
            }
        }
        this.LLILLJJLI = arrayList;
        return true;
    }
}
