package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241301Cnw extends Message<C2241301Cnw, C2241341Co0> {
    public static final ProtoAdapter<C2241301Cnw> ADAPTER = new ProtoAdapter<C2241301Cnw>() { // from class: X.1Cnx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241301Cnw decode(ProtoReader protoReader) {
            C2241341Co0 c2241341Co0 = new C2241341Co0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2241341Co0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2241341Co0.LJII = C2241321Cny.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2241341Co0.LJI = C2241211Cnn.ADAPTER.decode(protoReader);
                                }
                            } else {
                                try {
                                    c2241341Co0.LJFF = EnumC2241351Co1.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2241341Co0.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2241341Co0.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2241341Co0.LIZLLL = C2241841Coo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241341Co0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241301Cnw c2241301Cnw) {
            C2241301Cnw c2241301Cnw2 = c2241301Cnw;
            return C2241841Coo.ADAPTER.encodedSizeWithTag(1, c2241301Cnw2.image) + ProtoAdapter.INT32.encodedSizeWithTag(2, c2241301Cnw2.progress) + EnumC2241351Co1.ADAPTER.encodedSizeWithTag(3, c2241301Cnw2.task_status) + C2241211Cnn.ADAPTER.encodedSizeWithTag(4, c2241301Cnw2.error_info) + C2241321Cny.ADAPTER.encodedSizeWithTag(5, c2241301Cnw2.task_progress) + c2241301Cnw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241301Cnw redact(C2241301Cnw c2241301Cnw) {
            C2241341Co0 c2241341Co0NewBuilder = c2241301Cnw.newBuilder();
            C2241841Coo c2241841Coo = c2241341Co0NewBuilder.LIZLLL;
            if (c2241841Coo != null) {
                c2241341Co0NewBuilder.LIZLLL = C2241841Coo.ADAPTER.redact(c2241841Coo);
            }
            C2241211Cnn c2241211Cnn = c2241341Co0NewBuilder.LJI;
            if (c2241211Cnn != null) {
                c2241341Co0NewBuilder.LJI = C2241211Cnn.ADAPTER.redact(c2241211Cnn);
            }
            C2241321Cny c2241321Cny = c2241341Co0NewBuilder.LJII;
            if (c2241321Cny != null) {
                c2241341Co0NewBuilder.LJII = C2241321Cny.ADAPTER.redact(c2241321Cny);
            }
            c2241341Co0NewBuilder.clearUnknownFields();
            return c2241341Co0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241301Cnw c2241301Cnw) {
            C2241301Cnw c2241301Cnw2 = c2241301Cnw;
            C2241841Coo.ADAPTER.encodeWithTag(protoWriter, 1, c2241301Cnw2.image);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c2241301Cnw2.progress);
            EnumC2241351Co1.ADAPTER.encodeWithTag(protoWriter, 3, c2241301Cnw2.task_status);
            C2241211Cnn.ADAPTER.encodeWithTag(protoWriter, 4, c2241301Cnw2.error_info);
            C2241321Cny.ADAPTER.encodeWithTag(protoWriter, 5, c2241301Cnw2.task_progress);
            protoWriter.writeBytes(c2241301Cnw2.unknownFields());
        }
    };
    public static final Integer DEFAULT_PROGRESS = 0;
    public static final EnumC2241351Co1 DEFAULT_TASK_STATUS = EnumC2241351Co1.TaskStatusCreated;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetErrorInfo#ADAPTER", tag = 4)
    public final C2241211Cnn error_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetPictureStruct#ADAPTER", tag = 1)
    public final C2241841Coo image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer progress;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetProcess#ADAPTER", tag = 5)
    public final C2241321Cny task_progress;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetTaskStatus#ADAPTER", tag = 3)
    public final EnumC2241351Co1 task_status;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2241841Coo c2241841Coo = this.image;
        int iHashCode2 = (iHashCode + (c2241841Coo != null ? c2241841Coo.hashCode() : 0)) * 37;
        Integer num = this.progress;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        EnumC2241351Co1 enumC2241351Co1 = this.task_status;
        int iHashCode4 = (iHashCode3 + (enumC2241351Co1 != null ? enumC2241351Co1.hashCode() : 0)) * 37;
        C2241211Cnn c2241211Cnn = this.error_info;
        int iHashCode5 = (iHashCode4 + (c2241211Cnn != null ? c2241211Cnn.hashCode() : 0)) * 37;
        C2241321Cny c2241321Cny = this.task_progress;
        int iHashCode6 = iHashCode5 + (c2241321Cny != null ? c2241321Cny.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2241341Co0 newBuilder() {
        C2241341Co0 c2241341Co0 = new C2241341Co0();
        c2241341Co0.LIZLLL = this.image;
        c2241341Co0.LJ = this.progress;
        c2241341Co0.LJFF = this.task_status;
        c2241341Co0.LJI = this.error_info;
        c2241341Co0.LJII = this.task_progress;
        c2241341Co0.addUnknownFields(unknownFields());
        return c2241341Co0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.progress != null) {
            sb.append(", progress=");
            sb.append(this.progress);
        }
        if (this.task_status != null) {
            sb.append(", task_status=");
            sb.append(this.task_status);
        }
        if (this.error_info != null) {
            sb.append(", error_info=");
            sb.append(this.error_info);
        }
        if (this.task_progress != null) {
            sb.append(", task_progress=");
            sb.append(this.task_progress);
        }
        sb.replace(0, 2, "VisualPoetBotPicture{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241301Cnw)) {
            return false;
        }
        C2241301Cnw c2241301Cnw = (C2241301Cnw) obj;
        if (unknownFields().equals(c2241301Cnw.unknownFields()) && C1516540pZE.LJ(this.image, c2241301Cnw.image) && C1516540pZE.LJ(this.progress, c2241301Cnw.progress) && C1516540pZE.LJ(this.task_status, c2241301Cnw.task_status) && C1516540pZE.LJ(this.error_info, c2241301Cnw.error_info) && C1516540pZE.LJ(this.task_progress, c2241301Cnw.task_progress)) {
            return true;
        }
        return false;
    }

    public C2241301Cnw(C2241841Coo c2241841Coo, Integer num, EnumC2241351Co1 enumC2241351Co1, C2241211Cnn c2241211Cnn, C2241321Cny c2241321Cny) {
        this(c2241841Coo, num, enumC2241351Co1, c2241211Cnn, c2241321Cny, ByteString.EMPTY);
    }

    public C2241301Cnw(C2241841Coo c2241841Coo, Integer num, EnumC2241351Co1 enumC2241351Co1, C2241211Cnn c2241211Cnn, C2241321Cny c2241321Cny, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2241841Coo;
        this.progress = num;
        this.task_status = enumC2241351Co1;
        this.error_info = c2241211Cnn;
        this.task_progress = c2241321Cny;
    }
}
