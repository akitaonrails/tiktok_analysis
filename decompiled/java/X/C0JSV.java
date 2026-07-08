package X;

import X.C0JSP;

/* JADX INFO: renamed from: X.0JSV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0JSV<T extends C0JSP> {
    public T mView;

    public void detachView() {
        this.mView = null;
    }

    public T getViewInterface() {
        return this.mView;
    }

    public void attachView(T t) {
        this.mView = t;
    }
}
