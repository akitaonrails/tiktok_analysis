package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.List;

/* JADX INFO: renamed from: X.15Go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20492415Go<T> implements Observer<C0RD4> {
    public InterfaceC20492315Gn<T> LL;
    public DataCenter LLILLJJLI;
    public final InterfaceC20492515Gp<T> LLILLL;

    public C20492415Go(InterfaceC20492515Gp interfaceC20492515Gp) {
        this.LLILLJJLI = interfaceC20492515Gp.bm();
        this.LLILLL = interfaceC20492515Gp;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0RD4 c0rd42 = c0rd4;
        if (this.LL != null && c0rd42 != null && !TextUtils.isEmpty(c0rd42.LIZ)) {
            String str = c0rd42.LIZ;
            boolean zBooleanValue = false;
            Object obj = null;
            if (TextUtils.equals(str, this.LLILLL.vu())) {
                Object obj2 = c0rd42.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                if (obj != 0) {
                    this.LL.LIZ();
                    return;
                }
                return;
            }
            if (TextUtils.equals(str, this.LLILLL.R3())) {
                Object obj3 = c0rd42.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                if (obj == 0) {
                    return;
                }
                this.LL.showLoadMoreError();
                return;
            }
            if (!TextUtils.equals(str, this.LLILLL.LJLI())) {
                return;
            }
            C20449014zw c20449014zw = (C20449014zw) this.LLILLJJLI.get(this.LLILLL.LJLI());
            int iIntValue = ((Integer) c20449014zw.LIZ("action_type")).intValue();
            if (iIntValue == 1) {
                List<T> list = (List) c20449014zw.LIZ("list_data");
                InterfaceC20492315Gn<T> interfaceC20492315Gn = this.LL;
                Object objLIZ = c20449014zw.LIZ("list_hasmore");
                if (objLIZ instanceof Integer) {
                    if (((Integer) objLIZ).intValue() == 1) {
                        zBooleanValue = true;
                    }
                } else if (objLIZ instanceof Boolean) {
                    zBooleanValue = ((Boolean) objLIZ).booleanValue();
                }
                interfaceC20492315Gn.LLJJJIL(list, zBooleanValue);
                return;
            }
            if (iIntValue != 2) {
                return;
            }
            List<T> list2 = (List) c20449014zw.LIZ("list_data");
            InterfaceC20492315Gn<T> interfaceC20492315Gn2 = this.LL;
            Object objLIZ2 = c20449014zw.LIZ("list_hasmore");
            if (objLIZ2 instanceof Integer) {
                if (((Integer) objLIZ2).intValue() == 1) {
                    zBooleanValue = true;
                }
            } else if (objLIZ2 instanceof Boolean) {
                zBooleanValue = ((Boolean) objLIZ2).booleanValue();
            }
            interfaceC20492315Gn2.Pj(list2, zBooleanValue);
        }
    }

    public final void LIZ(View view, Bundle bundle) {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = this.LLILLL.bm();
        }
        if (this.LLILLJJLI != null) {
            if (!TextUtils.isEmpty(this.LLILLL.LJLI())) {
                this.LLILLJJLI.yQ2(this.LLILLL.LJLI(), this, false);
            }
            if (!TextUtils.isEmpty(this.LLILLL.vu())) {
                this.LLILLJJLI.yQ2(this.LLILLL.vu(), this, false);
            }
            if (!TextUtils.isEmpty(this.LLILLL.R3())) {
                this.LLILLJJLI.yQ2(this.LLILLL.R3(), this, false);
            }
        }
        this.LL = this.LLILLL.Q7(view);
        this.LLILLL.initData();
    }
}
