package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C693702nH extends Message<C693702nH, C693602nG> {
    public static final ProtoAdapter<C693702nH> ADAPTER = new ProtoAdapter<C693702nH>() { // from class: X.02nI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C693702nH decode(ProtoReader protoReader) {
            C693702nH c693702nH = new C693702nH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c693702nH.position = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c693702nH.label_type_str = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c693702nH.label_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c693702nH.label_image_dark = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c693702nH.label_image_light = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c693702nH;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C693702nH c693702nH) {
            C693702nH c693702nH2 = c693702nH;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c693702nH2.label_image_light) + protoAdapter.encodedSizeWithTag(2, c693702nH2.label_image_dark);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c693702nH2.label_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, c693702nH2.label_type_str) + protoAdapter2.encodedSizeWithTag(5, c693702nH2.position) + c693702nH2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C693702nH c693702nH) {
        }
    };
    public C02U1 label_image_dark;
    public C02U1 label_image_light;
    public Integer label_type;
    public String label_type_str;
    public Integer position;

    public C693702nH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C693602nG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
