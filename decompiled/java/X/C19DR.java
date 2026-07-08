package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19DR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DR implements InterfaceC21503119Dh {
    public static final C19DR LL = new C19DR();
    public static Function1<? super Activity, Unit> LLILLJJLI;
    public static Function1<? super Context, ? extends Context> LLILLL;

    @Override // X.InterfaceC21503119Dh
    public final void LJFF() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJII() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJIL(Activity activity, Context context) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJ() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIFFI(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJII(Bundle bundle) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIII() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIIJZLJL(BaseActivity baseActivity, boolean z) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIIZ(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIJ(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIJIIJI(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIJIIJIL() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIJIL(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIJL(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIJLIJ(BaseActivity baseActivity) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIL(Bundle bundle) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIZ() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJ(BaseActivity baseActivity, Configuration configuration) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJI() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJIL() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJJI() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJJIZL() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJJJ() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJJJJL() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void finish() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC21503119Dh
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // X.InterfaceC21503119Dh
    public final void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC21503119Dh
    public final void onUserInteraction() {
    }

    @Override // X.InterfaceC21503119Dh
    public final void u1(int i, Intent intent) {
    }

    @Override // X.InterfaceC21503119Dh
    public final Context LIZJ(Context context) {
        if (context == null) {
            return context;
        }
        Function1<? super Context, ? extends Context> function1 = LLILLL;
        if (function1 != null) {
            return function1.invoke(context);
        }
        return null;
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJI(BaseActivity baseActivity) {
        C1577910rAD.LIZ = C19DR.class;
    }

    @Override // X.InterfaceC21503119Dh
    public final void LJJIIJ(BaseActivity baseActivity) {
        Function1<? super Activity, Unit> function1 = LLILLJJLI;
        if (function1 != null) {
            function1.invoke(baseActivity);
        }
    }
}
