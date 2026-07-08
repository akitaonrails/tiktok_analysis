package X;

import Y.ACallableS99S0101000_29;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.ss.android.ugc.aweme.api.resp.AnchorSelectionResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.118L, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C118L extends AbstractC1255880imo<Object, AnchorSelectionResponse> {
    public final int LL;
    public int LLILLJJLI = 1;
    public final List<Object> LLILLL = new ArrayList();
    public final List<AnchorModule> LLILZ = new ArrayList();
    public final List<Object> LLILZIL = new ArrayList();
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;

    public final int LJIIJ() {
        Integer num;
        int i = 0;
        for (Object obj : (ArrayList) this.LLILLL) {
            if ((obj instanceof AnchorModule) && (num = ((AnchorModule) obj).type) != null && num.intValue() == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.AbstractC1255880imo
    public final List<Object> getItems() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLILZLL;
    }

    public C118L(int i) {
        this.LL = i;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    @Override // X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118L.handleData(java.lang.Object):void");
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS99S0101000_29(this, this.LLILLJJLI, 0), 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS99S0101000_29(this, 0, 0), 0);
    }
}
