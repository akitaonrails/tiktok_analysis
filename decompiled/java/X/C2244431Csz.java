package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Csz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244431Csz extends Message<C2244431Csz, C2244451Ct1> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C2244091CsR cover;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long digg_count;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 4)
    public final C2244091CsR fallback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long item_id;
    public static final ProtoAdapter<C2244431Csz> ADAPTER = new ProtoAdapter<C2244431Csz>() { // from class: X.1Ct0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244431Csz decode(ProtoReader protoReader) {
            C2244451Ct1 c2244451Ct1 = new C2244451Ct1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2244451Ct1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2244451Ct1.LJI = C2244091CsR.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2244451Ct1.LJFF = C2244091CsR.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2244451Ct1.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2244451Ct1.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244451Ct1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244431Csz c2244431Csz) {
            C2244431Csz c2244431Csz2 = c2244431Csz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2244431Csz2.item_id) + protoAdapter.encodedSizeWithTag(2, c2244431Csz2.digg_count);
            ProtoAdapter<C2244091CsR> protoAdapter2 = C2244091CsR.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2244431Csz2.cover) + protoAdapter2.encodedSizeWithTag(4, c2244431Csz2.fallback) + c2244431Csz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244431Csz redact(C2244431Csz c2244431Csz) {
            C2244451Ct1 c2244451Ct1NewBuilder = c2244431Csz.newBuilder();
            C2244091CsR c2244091CsR = c2244451Ct1NewBuilder.LJFF;
            if (c2244091CsR != null) {
                c2244451Ct1NewBuilder.LJFF = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2244091CsR c2244091CsR2 = c2244451Ct1NewBuilder.LJI;
            if (c2244091CsR2 != null) {
                c2244451Ct1NewBuilder.LJI = C2244091CsR.ADAPTER.redact(c2244091CsR2);
            }
            c2244451Ct1NewBuilder.clearUnknownFields();
            return c2244451Ct1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244431Csz c2244431Csz) {
            C2244431Csz c2244431Csz2 = c2244431Csz;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244431Csz2.item_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2244431Csz2.digg_count);
            ProtoAdapter<C2244091CsR> protoAdapter2 = C2244091CsR.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2244431Csz2.cover);
            protoAdapter2.encodeWithTag(protoWriter, 4, c2244431Csz2.fallback);
            protoWriter.writeBytes(c2244431Csz2.unknownFields());
        }
    };
    public static final Long DEFAULT_ITEM_ID = 0L;
    public static final Long DEFAULT_DIGG_COUNT = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.item_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.digg_count;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.cover;
        int iHashCode4 = (iHashCode3 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR2 = this.fallback;
        int iHashCode5 = iHashCode4 + (c2244091CsR2 != null ? c2244091CsR2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2244451Ct1 newBuilder() {
        C2244451Ct1 c2244451Ct1 = new C2244451Ct1();
        c2244451Ct1.LIZLLL = this.item_id;
        c2244451Ct1.LJ = this.digg_count;
        c2244451Ct1.LJFF = this.cover;
        c2244451Ct1.LJI = this.fallback;
        c2244451Ct1.addUnknownFields(unknownFields());
        return c2244451Ct1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.item_id != null) {
            sb.append(", item_id=");
            sb.append(this.item_id);
        }
        if (this.digg_count != null) {
            sb.append(", digg_count=");
            sb.append(this.digg_count);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        sb.replace(0, 2, "Item{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244431Csz)) {
            return false;
        }
        C2244431Csz c2244431Csz = (C2244431Csz) obj;
        if (unknownFields().equals(c2244431Csz.unknownFields()) && C1516540pZE.LJ(this.item_id, c2244431Csz.item_id) && C1516540pZE.LJ(this.digg_count, c2244431Csz.digg_count) && C1516540pZE.LJ(this.cover, c2244431Csz.cover) && C1516540pZE.LJ(this.fallback, c2244431Csz.fallback)) {
            return true;
        }
        return false;
    }

    public C2244431Csz(Long l, Long l2, C2244091CsR c2244091CsR, C2244091CsR c2244091CsR2) {
        this(l, l2, c2244091CsR, c2244091CsR2, ByteString.EMPTY);
    }

    public C2244431Csz(Long l, Long l2, C2244091CsR c2244091CsR, C2244091CsR c2244091CsR2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item_id = l;
        this.digg_count = l2;
        this.cover = c2244091CsR;
        this.fallback = c2244091CsR2;
    }
}
