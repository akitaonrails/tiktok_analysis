package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.10kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19335910kn implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
            case 3:
                onResult$3(this, obj);
                break;
            case 4:
                onResult$4(this, obj);
                break;
            case 5:
                onResult$5(this, obj);
                break;
        }
    }

    public static final void onResult$0(C19335910kn c19335910kn, Object obj) {
        ((C1295960jpS) c19335910kn.l0).setComposition((C1294720jnS) obj);
        if (!((C09AJ) c19335910kn.l1).isDisposed()) {
            ((C09AJ) c19335910kn.l1).onNext(CardStruct.IStatusCode.DEFAULT);
        }
    }

    public static final void onResult$1(C19335910kn c19335910kn, Object obj) {
        ((C1295960jpS) c19335910kn.l0).setComposition((C1294720jnS) obj);
        if (!((C09AJ) c19335910kn.l1).isDisposed()) {
            ((C09AJ) c19335910kn.l1).onNext("1");
        }
    }

    public static final void onResult$2(C19335910kn c19335910kn, Object obj) {
        ((C1898700zVc) c19335910kn.l0).LLJLILLLLZIIL = (C1294720jnS) obj;
        InterfaceC1898930zVz interfaceC1898930zVz = (InterfaceC1898930zVz) c19335910kn.l1;
        if (interfaceC1898930zVz != null) {
            interfaceC1898930zVz.LIZ();
        }
    }

    public static final void onResult$3(C19335910kn c19335910kn, Object obj) {
        ((C1302030jzF) c19335910kn.l0).setComposition((C1294720jnS) obj);
        InterfaceC1898930zVz interfaceC1898930zVz = (InterfaceC1898930zVz) c19335910kn.l1;
        if (interfaceC1898930zVz != null) {
            interfaceC1898930zVz.LIZ();
        }
    }

    public static final void onResult$4(C19335910kn c19335910kn, Object obj) {
        ((C1302030jzF) c19335910kn.l0).setComposition((C1294720jnS) obj);
        InterfaceC1898930zVz interfaceC1898930zVz = (InterfaceC1898930zVz) c19335910kn.l1;
        if (interfaceC1898930zVz != null) {
            interfaceC1898930zVz.LIZ();
        }
    }

    public static final void onResult$5(C19335910kn c19335910kn, Object obj) {
        ((C1302030jzF) c19335910kn.l0).setComposition((C1294720jnS) obj);
        InterfaceC1898930zVz interfaceC1898930zVz = (InterfaceC1898930zVz) c19335910kn.l1;
        if (interfaceC1898930zVz != null) {
            interfaceC1898930zVz.LIZ();
        }
    }

    public C19335910kn(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
