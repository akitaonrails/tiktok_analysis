package X;

import Y.AObjectS205S0300000_23;
import android.text.TextUtils;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.app.api.INetworkChunkNotify;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507060pJw extends AbstractC2343909Gj {
    public static C1507060pJw LJII;
    public final ReferenceQueue<C0QON<?>> LIZ = new ReferenceQueue<>();
    public final Map<String, C0QON> LIZIZ = new ConcurrentHashMap();
    public final Map<String, C1507070pJx> LIZJ = new ConcurrentHashMap();
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = false;
    public final Gson LJI;

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<?, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return null;
    }

    public static synchronized C1507060pJw LJII() {
        if (LJII == null) {
            LJII = new C1507060pJw(new Gson());
        }
        return LJII;
    }

    public C1507060pJw(Gson gson) {
        if (gson != null) {
            this.LJI = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    public final void LJI(String str, C0QON c0qon) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.LJFF) {
            ((ConcurrentHashMap) this.LIZIZ).put(str, c0qon);
            return;
        }
        while (true) {
            Reference<? extends C0QON<?>> referencePoll = this.LIZ.poll();
            if (referencePoll != null) {
                ((ConcurrentHashMap) this.LIZJ).remove(((C1507070pJx) referencePoll).LIZ);
            } else {
                ((ConcurrentHashMap) this.LIZJ).put(str, new C1507070pJx(str, c0qon, this.LIZ));
                return;
            }
        }
    }

    public final void LJIIIIZZ(Object obj, String str) {
        C0QON c0qon;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LJFF) {
            Reference reference = (Reference) ((ConcurrentHashMap) this.LIZJ).remove(str);
            if (reference != null && (c0qon = (C0QON) reference.get()) != null) {
                c0qon.onNext(obj);
                return;
            }
            return;
        }
        C0QON c0qon2 = (C0QON) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (c0qon2 == null) {
            return;
        }
        c0qon2.onNext(obj);
        ((ConcurrentHashMap) this.LIZIZ).remove(str);
    }

    @Override // X.AbstractC2343909Gj
    public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class) || !C1515820pY4.class.isAssignableFrom((Class) rawType)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        final boolean z = true;
        if (actualTypeArguments.length == 1) {
            final boolean z2 = false;
            Type type2 = actualTypeArguments[0];
            if (((type2 instanceof ParameterizedType) && ((ParameterizedType) type2).getRawType() == C1515830pY5.class) || !(type2 instanceof Class)) {
                return null;
            }
            final TypeAdapter typeAdapterLJIIIZ = this.LJI.LJIIIZ(TypeToken.get(type2));
            Class cls = (Class) type2;
            if (cls.getName().equals("com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse")) {
                final Gson gson = this.LJI;
                return new C09G9<T>(gson, typeAdapterLJIIIZ, z2, z) { // from class: X.0pXd
                    public final boolean LIZJ;
                    public final boolean LIZLLL;

                    @Override // X.C09G9, X.InterfaceC1501660pBE
                    public final /* bridge */ /* synthetic */ Object LIZ(TypedInput typedInput) {
                        return LIZ(typedInput);
                    }

                    @Override // X.C09G9
                    /* JADX INFO: renamed from: LIZIZ */
                    public final C1515820pY4<T> LIZ(final TypedInput typedInput) {
                        if (C1507060pJw.LJII().LIZLLL && this.LIZLLL && (!C1507060pJw.LJII().LJ || !C388401f8.LIZIZ)) {
                            final C1515670pXp c1515670pXp = new C1515670pXp(typedInput.in());
                            C1515560pXe c1515560pXe = new C1515560pXe(this, typedInput);
                            C0PQA c0pqa = new C0PQA();
                            c1515670pXp.LLJJI.clear();
                            final C1515820pY4 c1515820pY4 = new C1515820pY4(new InterfaceC644200POo<byte[]>() { // from class: X.0pXh
                                @Override // X.InterfaceC644200POo
                                public final void LIZ(C0POE<byte[]> c0poe) {
                                    C1515670pXp c1515670pXp2 = c1515670pXp;
                                    c1515670pXp2.LLJJ = c0poe;
                                    if (c1515670pXp2.LLJJI.size() > 0) {
                                        Iterator<Runnable> it2 = c1515670pXp.LLJJI.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().run();
                                        }
                                        c1515670pXp.LLJJI.clear();
                                    }
                                }
                            });
                            AObjectS205S0300000_23 aObjectS205S0300000_23 = new AObjectS205S0300000_23(c1515670pXp, new C1515580pXg(c1515670pXp, c1515560pXe, c1515820pY4), c0pqa, 0);
                            C388401f8.LIZIZ = true;
                            C23250099c.LIZLLL(C388401f8.LIZ, null, null, new C01Y2(aObjectS205S0300000_23, null), 3);
                            c1515820pY4.LLILZIL = c0pqa;
                            C1515840pY6 c1515840pY6LIZJ = c1515820pY4.LIZJ(new InterfaceC1515570pXf<byte[], Object>() { // from class: X.0pXt
                                @Override // X.InterfaceC1515570pXf
                                public final Object apply(byte[] bArr) {
                                    byte[] bArr2 = bArr;
                                    String charset = "UTF-8";
                                    if (typedInput.mimeType() != null) {
                                        charset = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
                                    }
                                    try {
                                        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr2), charset);
                                        try {
                                            Object obj = this.LIZJ.LIZIZ.read(this.LIZJ.LIZ.LJIIL(inputStreamReader));
                                            if (obj instanceof InterfaceC1201180hMa) {
                                                ((InterfaceC1201180hMa) obj).setRequestInfo(c1515820pY4.getRequestInfo());
                                            }
                                            if (obj instanceof C0X12) {
                                                ((C0X12) obj).setRequestId(c1515820pY4.LLILLL);
                                            }
                                            if (obj instanceof InterfaceC1515800pY2) {
                                                ((InterfaceC1515800pY2) obj).LIZIZ(c1515820pY4.LIZIZ());
                                            }
                                            if (obj instanceof InterfaceC1515810pY3) {
                                                c1515820pY4.getClass();
                                                ((InterfaceC1515810pY3) obj).LIZ();
                                            }
                                            INetworkChunkNotify iNetworkChunkNotify = (INetworkChunkNotify) PluggableExtentionKt.pluggableSpi$default(INetworkChunkNotify.class, false, false, false, 14, null);
                                            if (iNetworkChunkNotify != null && charset != null && bArr2 != null) {
                                                iNetworkChunkNotify.onChunkDataStreamFinish(obj, bArr2, charset, c1515820pY4.getRequestInfo(), EnumC1515750pXx.FAST_CHUNK);
                                            }
                                            inputStreamReader.close();
                                            return obj;
                                        } finally {
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new RuntimeException(e);
                                    }
                                }
                            });
                            if (c1515840pY6LIZJ != null) {
                                return c1515840pY6LIZJ;
                            }
                        }
                        C1515820pY4<byte[]> c1515820pY4LIZ = new C1515670pXp(typedInput.in()).LIZ();
                        if (this.LIZJ) {
                            c1515820pY4LIZ = new C1515840pY6(new C1515660pXo(c1515820pY4LIZ), c1515820pY4LIZ);
                        }
                        return c1515820pY4LIZ.LIZJ(new C1515720pXu(this, typedInput, c1515820pY4LIZ));
                    }

                    {
                        this.LIZJ = z2;
                        this.LIZLLL = z;
                    }
                };
            }
            if (C0BIP.LIZ() && cls.getName().equals("com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList")) {
                final Gson gson2 = this.LJI;
                return new C09G9<T>(gson2, typeAdapterLJIIIZ, z, z2) { // from class: X.0pXd
                    public final boolean LIZJ;
                    public final boolean LIZLLL;

                    @Override // X.C09G9, X.InterfaceC1501660pBE
                    public final /* bridge */ /* synthetic */ Object LIZ(TypedInput typedInput) {
                        return LIZ(typedInput);
                    }

                    @Override // X.C09G9
                    /* JADX INFO: renamed from: LIZIZ */
                    public final C1515820pY4<T> LIZ(final TypedInput typedInput) {
                        if (C1507060pJw.LJII().LIZLLL && this.LIZLLL && (!C1507060pJw.LJII().LJ || !C388401f8.LIZIZ)) {
                            final C1515670pXp c1515670pXp = new C1515670pXp(typedInput.in());
                            C1515560pXe c1515560pXe = new C1515560pXe(this, typedInput);
                            C0PQA c0pqa = new C0PQA();
                            c1515670pXp.LLJJI.clear();
                            final C1515820pY4 c1515820pY4 = new C1515820pY4(new InterfaceC644200POo<byte[]>() { // from class: X.0pXh
                                @Override // X.InterfaceC644200POo
                                public final void LIZ(C0POE<byte[]> c0poe) {
                                    C1515670pXp c1515670pXp2 = c1515670pXp;
                                    c1515670pXp2.LLJJ = c0poe;
                                    if (c1515670pXp2.LLJJI.size() > 0) {
                                        Iterator<Runnable> it2 = c1515670pXp.LLJJI.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().run();
                                        }
                                        c1515670pXp.LLJJI.clear();
                                    }
                                }
                            });
                            AObjectS205S0300000_23 aObjectS205S0300000_23 = new AObjectS205S0300000_23(c1515670pXp, new C1515580pXg(c1515670pXp, c1515560pXe, c1515820pY4), c0pqa, 0);
                            C388401f8.LIZIZ = true;
                            C23250099c.LIZLLL(C388401f8.LIZ, null, null, new C01Y2(aObjectS205S0300000_23, null), 3);
                            c1515820pY4.LLILZIL = c0pqa;
                            C1515840pY6 c1515840pY6LIZJ = c1515820pY4.LIZJ(new InterfaceC1515570pXf<byte[], Object>() { // from class: X.0pXt
                                @Override // X.InterfaceC1515570pXf
                                public final Object apply(byte[] bArr) {
                                    byte[] bArr2 = bArr;
                                    String charset = "UTF-8";
                                    if (typedInput.mimeType() != null) {
                                        charset = MimeUtil.parseCharset(typedInput.mimeType(), "UTF-8");
                                    }
                                    try {
                                        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr2), charset);
                                        try {
                                            Object obj = this.LIZJ.LIZIZ.read(this.LIZJ.LIZ.LJIIL(inputStreamReader));
                                            if (obj instanceof InterfaceC1201180hMa) {
                                                ((InterfaceC1201180hMa) obj).setRequestInfo(c1515820pY4.getRequestInfo());
                                            }
                                            if (obj instanceof C0X12) {
                                                ((C0X12) obj).setRequestId(c1515820pY4.LLILLL);
                                            }
                                            if (obj instanceof InterfaceC1515800pY2) {
                                                ((InterfaceC1515800pY2) obj).LIZIZ(c1515820pY4.LIZIZ());
                                            }
                                            if (obj instanceof InterfaceC1515810pY3) {
                                                c1515820pY4.getClass();
                                                ((InterfaceC1515810pY3) obj).LIZ();
                                            }
                                            INetworkChunkNotify iNetworkChunkNotify = (INetworkChunkNotify) PluggableExtentionKt.pluggableSpi$default(INetworkChunkNotify.class, false, false, false, 14, null);
                                            if (iNetworkChunkNotify != null && charset != null && bArr2 != null) {
                                                iNetworkChunkNotify.onChunkDataStreamFinish(obj, bArr2, charset, c1515820pY4.getRequestInfo(), EnumC1515750pXx.FAST_CHUNK);
                                            }
                                            inputStreamReader.close();
                                            return obj;
                                        } finally {
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new RuntimeException(e);
                                    }
                                }
                            });
                            if (c1515840pY6LIZJ != null) {
                                return c1515840pY6LIZJ;
                            }
                        }
                        C1515820pY4<byte[]> c1515820pY4LIZ = new C1515670pXp(typedInput.in()).LIZ();
                        if (this.LIZJ) {
                            c1515820pY4LIZ = new C1515840pY6(new C1515660pXo(c1515820pY4LIZ), c1515820pY4LIZ);
                        }
                        return c1515820pY4LIZ.LIZJ(new C1515720pXu(this, typedInput, c1515820pY4LIZ));
                    }

                    {
                        this.LIZJ = z;
                        this.LIZLLL = z2;
                    }
                };
            }
            if (!cls.getName().equals(String.class.getName())) {
                return new C09G9(this.LJI, typeAdapterLJIIIZ);
            }
            return new InterfaceC1501660pBE<TypedInput, C1515820pY4<T>>() { // from class: X.09G8
                @Override // X.InterfaceC1501660pBE
                public final Object LIZ(TypedInput typedInput) {
                    final TypedInput typedInput2 = typedInput;
                    return new C1515670pXp(typedInput2.in()).LIZ().LIZJ(new InterfaceC1515570pXf<byte[], Object>() { // from class: X.08fm
                        @Override // X.InterfaceC1515570pXf
                        public final Object apply(byte[] bArr) {
                            InputStreamReader inputStreamReader;
                            StringBuilder sb;
                            BufferedReader bufferedReader;
                            byte[] bArr2 = bArr;
                            String charset = "UTF-8";
                            if (typedInput2.mimeType() != null) {
                                charset = MimeUtil.parseCharset(typedInput2.mimeType(), "UTF-8");
                            }
                            try {
                                inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr2), charset);
                                try {
                                    sb = new StringBuilder();
                                    bufferedReader = new BufferedReader(inputStreamReader);
                                } finally {
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw new RuntimeException(e);
                            }
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    sb.append(line);
                                } else {
                                    String string = sb.toString();
                                    inputStreamReader.close();
                                    return string;
                                }
                                TryCatchGuardChecker.doCheck(e);
                                throw new RuntimeException(e);
                            }
                        }
                    });
                }
            };
        }
        throw new RuntimeException("ChunkBundle should have one generic type.");
    }
}
