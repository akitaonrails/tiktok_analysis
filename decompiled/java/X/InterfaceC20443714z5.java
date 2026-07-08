package X;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.14z5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20443714z5 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, AbstractC20444214zA abstractC20444214zA, CancellationSignal cancellationSignal, Executor executor, C15MM<AbstractC20434814xe, AbstractC20027413Xs> c15mm);

    void onGetCredential(Context context, C20444114z9 c20444114z9, CancellationSignal cancellationSignal, Executor executor, C15MM<C20433914xV, AbstractC20027713Xv> c15mm);
}
