package X;

import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0PN2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PN2<T, RESPONSE extends SearchApiResult> extends AbstractC1588960rS2<T, RESPONSE> {
    public C0PSG LL;
    public SearchResultParam LLILZ;
    public WeakReference<Fragment> LLILZIL;
    public WeakReference<C19EG> LLIZ;
    public C0PN3 LLIZLLLIL;
    public C0P9D LLJ;
    public boolean LLJI;
    public int LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public Long LLJJIJI;
    public String LLJJIJIIJIL;
    public final LinkedHashSet<T> LLILLJJLI = new LinkedHashSet<>();
    public final List<T> LLILLL = new ArrayList();
    public int LLILZLL = -1;
    public final boolean LLJIJIL = true;
    public String LLJILLL = "";

    public abstract int LJIJ();

    private final String LJIILL() {
        C0P9E keyword;
        C0P9D c0p9d = this.LLJ;
        return (c0p9d == null || (keyword = c0p9d.getKeyword()) == null) ? "" : (this.mListQueryType == 1 || TextUtils.isEmpty(keyword.LIZIZ)) ? keyword.LIZ : keyword.LIZIZ;
    }

    public final Fragment LJIILJJIL() {
        WeakReference<Fragment> weakReference = this.LLILZIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String LJIILLIIL() {
        String searchEnterFromPage;
        if (this.LLILZ != null) {
            LJIJJLI();
            WeakReference<C19EG> weakReference = this.LLIZ;
            if (weakReference != null) {
                weakReference.get();
            }
            SearchResultParam searchResultParam = this.LLILZ;
            if (searchResultParam != null && (searchEnterFromPage = searchResultParam.getSearchEnterFromPage()) != null) {
                return searchEnterFromPage;
            }
        }
        return "";
    }

    public static String LJIJJLI() {
        InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
        return interfaceC649890PeNLIZ != null ? C644560PPy.LJIILLIIL(interfaceC649890PeNLIZ.LJ()) : "null";
    }

    public final void LJIIL() {
        if (LJIJJ()) {
            this.LLILLJJLI.clear();
        } else {
            ((ArrayList) this.LLILLL).clear();
        }
    }

    @Override // X.AbstractC1255880imo
    public final List<T> getItems() {
        return LJIJJ() ? new ArrayList(this.LLILLJJLI) : this.LLILLL;
    }

    public boolean LJIJJ() {
        return this.LLJIJIL;
    }

    public final void LJIIJ(List<? extends T> list) {
        if (LJIJJ()) {
            if (list != null && !list.isEmpty()) {
                this.LLILLJJLI.addAll(list);
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        ((ArrayList) this.LLILLL).addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILIIL(java.lang.Object... r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.LJIILL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
            java.lang.String r1 = r4.LJIILL()
        L11:
            return r1
        L12:
            int r0 = r5.length
            java.lang.String r2 = ""
            if (r0 <= 0) goto L2c
            r0 = 0
            r1 = r5[r0]
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L2c
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            if (r0 <= r3) goto L42
            r1 = r1[r3]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L42
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L2c:
            boolean r0 = r4.LLJJ
            if (r0 == 0) goto L42
            int r1 = r5.length
            r0 = 2
            if (r1 != r0) goto L42
            r1 = r5[r3]
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L42
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L42
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L11
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PN2.LJIILIIL(java.lang.Object[]):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140  */
    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIJI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleData(RESPONSE r11) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PN2.handleData(com.ss.android.ugc.aweme.discover.model.SearchApiResult):void");
    }

    public void LJIL(List<? extends T> list) {
        if (LJIJJ()) {
            this.LLILLJJLI.clear();
            if (list != null && !list.isEmpty()) {
                this.LLILLJJLI.addAll(list);
                return;
            }
            return;
        }
        ((ArrayList) this.LLILLL).clear();
        if (list == null || list.isEmpty()) {
            return;
        }
        ((ArrayList) this.LLILLL).addAll(list);
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        String str;
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (C10EU.LJIIIIZZ()) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = new Exception("Under ChildrenMode");
            this.mHandler.sendMessage(messageObtain);
            return false;
        }
        if ((needCheckEmptyForQueryType() && isDataEmpty()) || ((Integer) objArr[0]).intValue() == 1) {
            this.LLJJIJIIJIL = this.LLJJI;
        }
        return super.sendRequest(Arrays.copyOf(objArr, objArr.length));
    }

    public final void LJIIJJI(int i, String str) {
        C0PN3 c0pn3 = this.LLIZLLLIL;
        if (c0pn3 != null) {
            c0pn3.LIZ(i, str);
            this.LLIZLLLIL = null;
            if (isLoading()) {
                this.mIsLoading = false;
            }
        }
    }
}
