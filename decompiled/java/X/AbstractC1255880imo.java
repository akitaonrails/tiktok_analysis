package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0imo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1255880imo<T, K> extends AbstractC666100QAu<K> {
    public int mCount;
    public boolean mIsNewDataEmpty;
    public int mSmartType;
    public int mListQueryType = 1;
    public final boolean mUIThreadOptimizationEnable = C0C64.LJIILLIIL().LJIIIZ(31744, "search_scrolling_ui_thread_overload_optimization_phase_2", true, false);
    public final boolean mIsExceptionOptEnable = ((Boolean) C0A4Q.LIZ.getValue()).booleanValue();

    public int getCurrentIndex() {
        return -1;
    }

    public abstract List<T> getItems();

    public int getListCount() {
        return -1;
    }

    public boolean hasLocateItem() {
        return false;
    }

    public boolean hasMoreUp() {
        return false;
    }

    public abstract boolean isHasMore();

    public void loadCache(Object... objArr) {
    }

    public void loadLatestList(Object... objArr) {
    }

    public abstract void loadMoreList(Object... objArr);

    public boolean needCheckEmptyForQueryType() {
        return true;
    }

    public void onModelBound() {
    }

    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isDataEmpty() {
        return C086I.LIZIZ(getItems());
    }

    public int getListQueryType() {
        return this.mListQueryType;
    }

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    public boolean deleteItem(T t) {
        List<T> items = getItems();
        if (C086I.LIZIZ(items)) {
            return false;
        }
        int iIndexOf = items.indexOf(t);
        boolean zRemove = items.remove(t);
        if (iIndexOf >= 0) {
            for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                if (interfaceC1526205yG != null && (interfaceC1526205yG instanceof InterfaceC1255940imu)) {
                    ((InterfaceC1255940imu) interfaceC1526205yG).Y1(iIndexOf);
                }
            }
        }
        return zRemove;
    }

    public int deleteItems(List<T> list) {
        List<T> items = getItems();
        if (C086I.LIZIZ(items) || C086I.LIZIZ(list)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : list) {
            int iIndexOf = items.indexOf(t);
            if (iIndexOf >= 0) {
                arrayList.add(Integer.valueOf(iIndexOf));
            }
            if (items.remove(t)) {
                i++;
            }
        }
        if (!arrayList.isEmpty()) {
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) ListProtector.get(arrayList, i2)).intValue();
            }
            for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                if (interfaceC1526205yG instanceof InterfaceC1255940imu) {
                    ((InterfaceC1255940imu) interfaceC1526205yG).Dl(iArr);
                }
            }
        }
        return i;
    }

    public boolean insertItem(T t) {
        int size;
        List<T> items = getItems();
        if (items == null) {
            size = 0;
        } else {
            size = items.size();
        }
        return insertItem(t, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #0 {Exception -> 0x0081, blocks: (B:26:0x0041, B:28:0x0046, B:30:0x004a, B:32:0x0050, B:38:0x0076, B:33:0x0059, B:35:0x0067, B:37:0x006d), top: B:55:0x0041 }] */
    @Override // X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sendRequest(java.lang.Object... r5) {
        /*
            r4 = this;
            boolean r0 = super.sendRequest(r5)
            r1 = 0
            if (r0 == 0) goto L9e
            boolean r0 = r4.needCheckEmptyForQueryType()
            r3 = 4
            r2 = 1
            if (r0 == 0) goto L34
            boolean r0 = r4.isDataEmpty()
            if (r0 == 0) goto L34
            r4.mListQueryType = r2
        L17:
            int r1 = r4.mListQueryType
            if (r1 == r2) goto L9a
            r0 = 2
            if (r1 == r0) goto L96
            if (r1 == r3) goto L92
            r0 = 8
            if (r1 == r0) goto L8e
            r0 = 16
            if (r1 == r0) goto L8a
            r0 = 19
            if (r1 == r0) goto L86
            r0 = 20
            if (r1 != r0) goto L33
            r4.loadMoreList(r5)
        L33:
            return r2
        L34:
            r0 = r5[r1]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.mListQueryType = r0
            int r0 = r5.length
            if (r0 < r3) goto L17
            boolean r0 = r4.mUIThreadOptimizationEnable     // Catch: java.lang.Exception -> L81
            r1 = 3
            if (r0 == 0) goto L59
            boolean r0 = r4.mIsExceptionOptEnable     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L76
            r1 = r5[r1]     // Catch: java.lang.Exception -> L81
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L17
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L81
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L81
            r4.mSmartType = r0     // Catch: java.lang.Exception -> L81
            goto L17
        L59:
            X.01GW r0 = X.C0A4Q.LIZ     // Catch: java.lang.Exception -> L81
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L81
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L76
            r1 = r5[r1]     // Catch: java.lang.Exception -> L81
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L17
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L81
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L81
            r4.mSmartType = r0     // Catch: java.lang.Exception -> L81
            goto L17
        L76:
            r0 = r5[r1]     // Catch: java.lang.Exception -> L81
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L81
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L81
            r4.mSmartType = r0     // Catch: java.lang.Exception -> L81
            goto L17
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L17
        L86:
            r4.refreshList(r5)
            return r2
        L8a:
            r4.loadCache(r5)
            return r2
        L8e:
            r4.loadMoreList(r5)
            return r2
        L92:
            r4.loadMoreList(r5)
            return r2
        L96:
            r4.loadLatestList(r5)
            return r2
        L9a:
            r4.refreshList(r5)
            return r2
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1255880imo.sendRequest(java.lang.Object[]):boolean");
    }

    public void setCount(int i) {
        this.mCount = i;
    }

    public boolean insertItem(T t, int i) {
        List<T> items = getItems();
        if (items == null) {
            items = new ArrayList<>();
        }
        if (i >= 0 && i <= items.size()) {
            ListProtector.add(items, i, t);
            if (items.size() == 1) {
                setItems(items);
            }
            for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                if (interfaceC1526205yG != null && (interfaceC1526205yG instanceof InterfaceC1255940imu)) {
                    ((InterfaceC1255940imu) interfaceC1526205yG).w(i, items);
                }
            }
            return true;
        }
        return false;
    }

    public boolean insertItemList(List<T> list, int i) {
        List<T> items = getItems();
        if (C086I.LIZIZ(items)) {
            items = new ArrayList<>();
        }
        if (i >= 0 && i <= items.size()) {
            items.addAll(i, list);
            if (items.size() == 1) {
                setItems(items);
            }
            for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                if (interfaceC1526205yG != null && (interfaceC1526205yG instanceof InterfaceC1255940imu)) {
                    ((InterfaceC1255940imu) interfaceC1526205yG).w(i, items);
                }
            }
            return true;
        }
        return false;
    }
}
