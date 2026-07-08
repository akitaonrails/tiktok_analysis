package com.bytedance.android.live.liveinteract.multiguestv3.ui;

import X.C755680Tkc;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class DismissListenerProxy implements Parcelable {
    public static final int $stable = 0;
    public static final C755680Tkc Companion = new Object() { // from class: X.0Tkc
    };
    public final Function1<Integer, Unit> callback;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DismissListenerProxy(Function1<? super Integer, Unit> function1) {
        this.callback = function1;
    }
}
