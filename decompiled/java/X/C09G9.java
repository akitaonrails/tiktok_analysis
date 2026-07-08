package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: renamed from: X.09G9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09G9<T> implements InterfaceC1501660pBE<TypedInput, C1515820pY4<T>> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;

    @Override // X.InterfaceC1501660pBE
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public C1515820pY4<T> LIZ(TypedInput typedInput) {
        C1515820pY4<byte[]> c1515820pY4LIZ = new C1515670pXp(typedInput.in()).LIZ();
        return c1515820pY4LIZ.LIZJ(new C1515720pXu(this, typedInput, c1515820pY4LIZ));
    }

    public C09G9(Gson gson, TypeAdapter<T> typeAdapter) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
    }
}
